package SQLClient;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * MySQL client
 * @author Fobec 2010
 */
public class SQLClient
{
	private String dbURL = "";
	private String user = "";
	private String password = "";
	private java.sql.Connection dbConnect = null;
	private java.sql.Statement dbStatement = null;
	
	/**
	 * Constructeur
	 * @param url
	 * @param user
	 * @param password
	 */
	public SQLClient(String url, String user, String password)
	{
	    this.dbURL = url;
	    this.user = user;
	    this.password = password;
	}
	
	/**
	 * Connecter a la base de donnee
	 * @return false en cas d'echec
	 */
	public Boolean connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.dbConnect = DriverManager.getConnection("jdbc:mysql:" + this.dbURL, this.user, this.password);
			this.dbStatement = this.dbConnect.createStatement();
			return true;
		}
		catch (SQLException ex)
		{
			Logger.getLogger(SQLClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch (ClassNotFoundException ex)
		{
			Logger.getLogger(SQLClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			Logger.getLogger(SQLClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			Logger.getLogger(SQLClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	/**
	 * Executer une requete SQL
	 * @param sql
	 * @return resultat de la requete
	 */
	public ResultSet executeQuery(String sql)
	{
		try
		{
			ResultSet rs = this.dbStatement.executeQuery(sql);
			return rs;
		}
		catch (SQLException ex)
		{
			Logger.getLogger(SQLClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	
	/**
	 * Fermer la connexion au serveur de DB
	 */
	public void close()
	{
		try
		{
			this.dbStatement.close();
			this.dbConnect.close();
			this.dbConnect.close();
		}
		catch (SQLException ex)
		{
			Logger.getLogger(SQLClient.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	/**
	 * Exemple d'utilisation de la class
	 * @param args
	 */
	public static void main(String[] args)
	{
		SQLClient SQLClient = new SQLClient("//localhost", "root", "SQLS3rv3r");
		if (SQLClient.connect())
		{
			try
			{
				/*ResultSet rs = SQLClient.exec("SELECT * FROM table");
				if (rs != null)
				{
					while (rs.next())
					{
						System.out.println("Valeur: " + rs.getString(1));
					}
				}*/
				ResultSet rs = SQLClient.executeQuery("SHOW DATABASES");
				if (rs != null)
				{
					while (rs.next())
					{
						System.out.println("DataB: " + rs.getString(1));
					}
				}
				SQLClient.executeQuery("USE gentoo");
				rs = SQLClient.executeQuery("SHOW TABLES");
				if (rs != null)
				{
					while (rs.next())
					{
						System.out.println("Table: " + rs.getString(1));
					}
				}
			}
			catch (SQLException ex)
			{
				Logger.getLogger(SQLClient.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		else
		{
			System.out.println("Mysql connection failed !!!");
		}
		SQLClient.close();
	}
}