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

	public Administrator(SQLClient SQLCli, Liaison Link) throws NoSuchAlgorithmException
	{
		if(!adminCreated)
		{
			adminCreated=true;
			this.SQLCli=SQLCli;
			this.Link=Link;
			Pass=ServerUser.sha1("Password");
		}
		else
		{
			System.out.println("Administrator already created.");
			System.exit(1);
		}
		ticket=rand.nextInt();
		while(ticket<=1000000)ticket=rand.nextInt();
	}

	public int Connect(String Password) throws NoSuchAlgorithmException
	{
		if(ServerUser.sha1(Password).compareTo(Pass)==0)
		{
			ticket=rand.nextInt();
			while(ticket<=1000000)ticket=rand.nextInt();
			lastUse=new Date();
			return ticket;
		}
		return -1;
	}

	public boolean CreatePartner(int t, String URL, String ImageURL) throws Exception
	{
		if(t!=ticket)return false;
		lastUse=new Date();
		Link.sendMessages("INSERT INTO Partners VALUES('"+URL+"','"+ImageURL+"',NULL)");
		return true;
	}

	public boolean CreatePartnerWithName(int t, String URL, String ImageURL, String Name) throws Exception
	{
		if(t!=ticket)return false;
		lastUse=new Date();
		Link.sendMessages("INSERT INTO Partners VALUES('"+URL+"','"+ImageURL+"','"+Name+"')");
		return true;
	}

	public String getPartners(int t)
	{
		if(t!=ticket)return null;
		String result=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT * FROM Partners");
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
