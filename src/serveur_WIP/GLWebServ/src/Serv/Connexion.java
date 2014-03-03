package Serv;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import javax.jws.WebService;

import SQLClient.SQLClient;

import ServerUsers.Administrator;
import ServerUsers.Partners;
import ServerUsers.Runners;

@WebService(name = "ConnexionWebServ", targetNamespace = "http://Connexion.GLWebServ.com")
public class Connexion
{
	private SQLClient SQLCli;
	Liaison Link;

	private Administrator Admin;
	public Administrator getAdmin()
	{ return Admin; }
	private Partners Parts;
	public Partners getPartners()
	{ return Parts; }
	private Runners Runns;
	public Runners getRunners()
	{ return Runns; }
	
	public Connexion() throws Exception
	{
		SQLCli = new SQLClient("//localhost", "root", "SQLS3rv3r");
		if (SQLCli.connect())
		{
			SQLCli.executeQuery("USE GL");
		}
		else
		{
			System.out.println("MySQL connection failed !!!");
			System.exit(1);
		}
		Link = new Liaison();
		loadAdministrator();
		loadPartners();
		loadRunners();
	}

	/*@WebMethod(operationName="ConnectAdmin")
	@RequestWrapper(targetNamespace = "http://localhost:8090/types", className="java.lang.String")
	@ResponseWrapper(targetNamespace = "http://localhost:8090/types", className="ServerUsers.Administrator")
	@WebResult(targetNamespace = "http://localhost:8090/types", name="Administrator")
	public Administrator ConnectAdmin(@WebParam(targetNamespace="http://localhost:8090/types", name="Password", mode=Mode.IN)String Password) throws NoSuchAlgorithmException
	{ return Admin.Connect(Password); }*/

	/*@WebMethod
	@RequestWrapper(targetNamespace = "http://localhost:8090/types", className="java.lang.String")*/
	public void sendMessages(String S) throws Exception
	{ Link.sendMessages(S); }

	private void loadAdministrator() throws NoSuchAlgorithmException
	{ Admin=new Administrator(SQLCli, Link); }

	private void loadPartners()
	{
		Parts=new Partners(SQLCli);
	}

	private void loadRunners()
	{
		Runns=new Runners(SQLCli, Link);
	}

	@Override
	protected void finalize() throws Throwable
	{
		Link.finish();
		SQLCli.close();
		super.finalize();
	}
}
