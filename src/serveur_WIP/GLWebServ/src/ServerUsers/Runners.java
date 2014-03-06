package ServerUsers;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import javax.jws.WebService;

import SQLClient.SQLClient;
import Serv.Liaison;

@WebService(name = "RunnersWebServ", targetNamespace = "http://Runners.GLWebServ.com")
public class Runners implements Runnable
{
	private Liaison Link;
	private SQLClient SQLCli;
	private HashMap<Integer, String> ConnectedUsers;
	private HashMap<Integer, Date> TicketsLifeTime;
	private Random rand = new Random();

	public Runners(SQLClient SQLCli, Liaison Link)
	{
		this.SQLCli=SQLCli;
		this.Link=Link;
		ConnectedUsers=new HashMap<Integer, String>();
		TicketsLifeTime=new HashMap<Integer, Date>();
	}

	private boolean used(int ticket)
	{
		if(!ConnectedUsers.containsKey(ticket))return false;
		TicketsLifeTime.remove(ticket);
		TicketsLifeTime.put(ticket, new Date());
		return true;
	}

	public boolean Inscription(String phoneNumber, String Mail, String Password, String LastName, String FirstName, String ImageURL, String City, String InscriptionCity)
	{
		int i=0;
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Runners WHERE Phone = '"+phoneNumber+"'");
		try
		{
			if (rs != null && rs.next())
					return false;
			rs = SQLCli.executeQuery("SELECT * FROM Events WHERE City = '"+City+"'");
			if (rs != null)
			{
				while (rs.next())
					i++;
				if(i!=1)return false;
			}
			rs = SQLCli.executeQuery("SELECT * FROM Events WHERE City = '"+InscriptionCity+"'");
			if (rs != null)
			{
				while (rs.next())
					i++;
				if(i!=1)return false;
			}
			Link.sendMessages("INSERT INTO Runners VALUES('"+phoneNumber+"','"+Mail+"','"+ServerUser.sha1(Password)+"','"+LastName+"','"+FirstName+"',"+((ImageURL==null)?("NULL"):("'"+ImageURL+"'"))+","+((City==null)?("NULL"):("'"+City+"'"))+InscriptionCity+"',0,NULL,2)");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public String getEventInfo(int ticket)
	{
		String result=new String();
		if(!used(ticket))return null;
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Events,Runners WHERE Events.City=Runners.City AND Runner.Phone='"+ConnectedUsers.get(ticket)+"'");
		if (rs != null)
		{
			try
			{
				while (rs.next())
				{
					for(int i=1;i<=10;i++)
						result+=rs.getString(i)+((i==10)?"":" ");
					if(!rs.isLast())result+="\n";
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			return result;
		}
		return null;
	}

	public boolean ClientUpdateLenght(int ticket, int length)
	{
		if(!used(ticket))return false;
		try
		{
			Link.sendMessages("UPDATE Runners SET Length = "+length+" WHERE Phone = '"+ConnectedUsers.get(ticket)+"'");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public String ClientGetRunners()
	{
		String result=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Runners");
		if (rs != null)
		{
			try
			{
				while (rs.next())
				{
					result+=rs.getString(1);
					if(!rs.isLast())result+="\n";
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			return result;
		}
		return null;
	}

	public String ClientGetEvents()
	{
		String result=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Events");
		if (rs != null)
		{
			try
			{
				while (rs.next())
				{
					result+=rs.getString(1);
					if(!rs.isLast())result+="\n";
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			return result;
		}
		return null;
	}

	public int ConnectRunner(String phoneNumber, String Password)
	{
		String Pass=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT ImageURL FROM Runners WHERE Phone='"+phoneNumber+"' AND BlackListed=0");
		try
		{
			if (rs==null||rs.isLast()) return -1;
			while (rs.next())
			{
				Pass+=rs.getString(1);
				if(!rs.isLast())Pass+="\n";
			}

			if(ServerUser.sha1(Password).compareTo(Pass)==0)
			{
				int ticket=rand.nextInt();
				while(ticket<=1000000&&ConnectedUsers.containsKey(ticket))ticket=rand.nextInt();
				ConnectedUsers.put(ticket, phoneNumber);
				TicketsLifeTime.put(ticket, new Date());
				return ticket;
			}
		}
		catch (SQLException e)
		{ e.printStackTrace(); }
		catch (NoSuchAlgorithmException e)
		{ e.printStackTrace(); }
		return -1;
	}

	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(1000);
				Iterator<Integer> I=TicketsLifeTime.keySet().iterator();
				while(I.hasNext())
				{
					int t=I.next();
					if((new Date()).getTime()>(TicketsLifeTime.get(t).getTime()+300000))
					{
						ConnectedUsers.remove(t);
						TicketsLifeTime.remove(t);
					}
				}
			}
			catch (InterruptedException e)
			{ e.printStackTrace(); }
		}
	}
}
