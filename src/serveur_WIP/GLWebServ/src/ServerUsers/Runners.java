package ServerUsers;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import javax.jws.WebService;

import SQLClient.SQLClient;
import Serv.Liaison;

@WebService(name = "RunnersWebServ", targetNamespace = "http://Runners.GLWebServ.com")
public class Runners implements Runnable
{
	private Liaison Link;
	private SQLClient SQLCli;
	private HashMap<Integer, String> ConnectedUsers;
	private HashMap<Date, Integer> TicketsLifeTime;
	private Random rand = new Random();

	public Runners(SQLClient SQLCli, Liaison Link)
	{
		this.SQLCli=SQLCli;
		this.Link=Link;
		ConnectedUsers=new HashMap<Integer, String>();
		TicketsLifeTime=new HashMap<Date, Integer>();
	}

	public int Connect(String phoneNumber, String Password) throws NoSuchAlgorithmException, SQLException
	{
		String Pass=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT ImageURL FROM Runners WHERE Phone='"+phoneNumber+"'");
		if (rs==null||rs.isLast()) return -1;
		try
		{
			while (rs.next())
			{
				Pass+=rs.getString(1);
				if(!rs.isLast())Pass+="\n";
			}
		}
		catch (SQLException e)
		{ e.printStackTrace(); }

		if(ServerUser.sha1(Password).compareTo(Pass)==0)
		{
			int ticket=rand.nextInt();
			while(ticket<=1000000&&ConnectedUsers.containsKey(ticket))ticket=rand.nextInt();
			ConnectedUsers.put(ticket, phoneNumber);
			TicketsLifeTime.put(new Date(), ticket);
			return ticket;
		}
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
				Set<Date> Dates=TicketsLifeTime.keySet();
				Iterator<Date> I=Dates.iterator();
				while(I.hasNext())
				{
					Date D=I.next();
					if((new Date()).getTime()>(D.getTime()+300000))
					{
						ConnectedUsers.remove(TicketsLifeTime.get(D));
						TicketsLifeTime.remove(D);
					}
				}
			}
			catch (InterruptedException e)
			{ e.printStackTrace(); }
		}
	}
}
