package ServerUsers;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;

import javax.jws.WebService;

import SQLClient.SQLClient;

import Serv.Liaison;

@WebService(name = "AdminWebServ", targetNamespace = "http://Admin.GLWebServ.com")
public class Administrator implements Runnable
{
	private static boolean adminCreated=false;
	private SQLClient SQLCli;
	private Liaison Link;
	private String Pass;

	private Random rand = new Random();
	private int ticket;
	private Date lastUse=new Date();

	public Administrator(SQLClient SQLCli, Liaison Link)
	{
		if(!adminCreated)
		{
			adminCreated=true;
			this.SQLCli=SQLCli;
			this.Link=Link;
			try
			{
				Pass=ServerUser.sha1("Adm!nP4ssw0rd");
			}
			catch (NoSuchAlgorithmException e)
			{ e.printStackTrace(); }
		}
		else
		{
			System.out.println("Administrator already created.");
			System.exit(1);
		}
		ticket=rand.nextInt();
		while(ticket<=1000000)ticket=rand.nextInt();
	}

	public void DeconnectAdmin(int t)
	{
		if(t!=ticket)return;
		ticket=rand.nextInt();
		while(ticket<=1000000)ticket=rand.nextInt();
	}

	public int ConnectAdmin(String Password)
	{
		try
		{
			if(ServerUser.sha1(Password).compareTo(Pass)==0)
			{
				ticket=rand.nextInt();
				while(ticket<=1000000)ticket=rand.nextInt();
				lastUse=new Date();
				return ticket;
			}
		}
		catch (NoSuchAlgorithmException e)
		{ e.printStackTrace(); }
		return -1;
	}

	public boolean CreatePartner(int t, String URL, String ImageURL, String Name)
	{
		if(t!=ticket)return false;
		lastUse=new Date();
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Partners WHERE URL = '"+URL+"'");
		try
		{
			if (rs != null && rs.next())
					return false;
			Link.sendMessages("INSERT INTO Partners VALUES('"+URL+"','"+ImageURL+"','"+Name+"')");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean DeletePartner(int t, String URL)
	{
		if(t!=ticket)return false;
		lastUse=new Date();
		int i=0;
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Partners WHERE URL = '"+URL+"'");
		try
		{
			if (rs != null)
			{
				while (rs.next())
					i++;
				if(i!=1)return false;
			}
			Link.sendMessages("DELETE FROM Partners WHERE URL='"+URL+"'");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean CreateEvent(int t, String City, String Name, long Start, long End, String Place, long Time, double StartLongitude, double StartLatitude, double Lenght, String Information)
	{
		if(t!=ticket)return false;
		lastUse=new Date();
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Events WHERE City = '"+City+"'");
		try
		{
			if (rs != null && rs.next())
				return false;
			Link.sendMessages("INSERT INTO Events VALUES('"+City+"','"+Name+"','"+Start+"','"+End+"','"+Place+"','"+Time+"','"+StartLongitude+"','"+StartLatitude+"','"+Lenght+"',"+((Information==null)?("NULL"):("'"+Information+"'"))+")");
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

	public boolean DeleteEvent(int t, String City)
	{
		if(t!=ticket)return false;
		lastUse=new Date();
		int i=0;
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Events WHERE City = '"+City+"'");
		try
		{
			if (rs != null)
			{
				while (rs.next())
					i++;
				if(i!=1)return false;
			}
			Link.sendMessages("DELETE FROM Events WHERE City='"+City+"'");
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

	public boolean AssignOrganiator(int t, String PhoneNb, String City)
	{
		if(t!=ticket)return false;
		lastUse=new Date();
		int i=0;
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Runners WHERE Phone = '"+PhoneNb+"' AND BlackListed=0 AND InscriptionCity='"+City+"'");
		try
		{
			if (rs != null)
			{
				while (rs.next())
					i++;
				if(i!=1)return false;
			}
			rs = SQLCli.executeQuery("SELECT * FROM Runners WHERE Organize = '"+City+"'");
			if (rs != null)
					while (rs.next())
						Link.sendMessages("UPDATE Runners SET Organize = NULL WHERE Phone = '"+rs.getString(1)+"'");
			i=0;
			rs = SQLCli.executeQuery("SELECT * FROM Events WHERE City = '"+City+"'");
			if (rs != null)
			{
				while (rs.next())
					i++;
				if(i!=1)return false;
			}
			
			Link.sendMessages("UPDATE Runners SET Organize = '"+City+"' WHERE Phone = '"+PhoneNb+"'");
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

	public boolean SetBlackListRunner(int t, int BL, String PhoneNb)
	{
		if(t!=ticket)return false;
		lastUse=new Date();
		int i=0;
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Runners WHERE Phone = '"+PhoneNb+"' AND Organize=NULL");
		try
		{
			if (rs != null)
			{
					while (rs.next())
						i++;
				if(i!=1)return false;
			}
			Link.sendMessages("UPDATE Runners SET BlackListed = "+BL+" WHERE Phone = '"+PhoneNb+"'");
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

	public String AdminGetRunners(int t)
	{
		if(t!=ticket)return null;
		lastUse=new Date();
		String result=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Runners");
		try
		{
			if (rs != null)
			{
					while (rs.next())
					{
						for(int i=1;i<=11;i++)
							result+=rs.getString(i)+((i==11)?"":" ");
						if(!rs.isLast())result+="\n";
					}
				return result;
			}
		}
		catch (SQLException e)
		{ e.printStackTrace(); }
		return null;
	}

	public String AdminGetEvents(int t)
	{
		if(t!=ticket)return null;
		lastUse=new Date();
		String result=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Events");
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

	public String AdminGetPartners(int t)
	{
		if(t!=ticket)return null;
		lastUse=new Date();
		String result=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Partners");
		if (rs != null)
		{
			try
			{
				while (rs.next())
				{
					for(int i=1;i<=3;i++)
						result+=rs.getString(i)+((i==3)?"":" ");
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

	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				/* If there is no activity since 5 minutes, */
				/* reinit the ticket to make it unusable.   */
				Thread.sleep(1000);
				if((new Date()).getTime()>(lastUse.getTime()+300000))
				{
					ticket=rand.nextInt();
					while(ticket<=1000000)ticket=rand.nextInt();
					lastUse=new Date();
					//System.out.println(lastUse);
				}
			}
			catch (InterruptedException e)
			{ e.printStackTrace(); }
		}
	}
}
