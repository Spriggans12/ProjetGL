package ServerUsers;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;

import SQLClient.SQLClient;

@WebService(name = "PartnersWebServ", targetNamespace = "http://Partners.GLWebServ.com")
public class Partners
{
	SQLClient SQLCli;
	public Partners(SQLClient SQLCli)
	{ this.SQLCli=SQLCli; }

	public String getPartnersList()
	{
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
			{ e.printStackTrace(); }
			return result;
		}
		return null;
	}

	public String getName(String URL)
	{
		String result=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT Name FROM Partners WHERE URL='"+URL+"'");
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
			{ e.printStackTrace(); }
			return result;
		}
		return null;
	}

	public String getPicture(String URL)
	{
		String result=new String();
		ResultSet rs = SQLCli.executeQuery("SELECT ImageURL FROM Partners WHERE URL='"+URL+"'");
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
			{ e.printStackTrace(); }
			return result;
		}
		return null;
	}
}
