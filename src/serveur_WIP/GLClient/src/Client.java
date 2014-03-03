import java.util.Scanner;

import com.glwebserv.connexion.ConnexionWebServ;
import com.glwebserv.connexion.Exception_Exception;
import com.glwebserv.connexion.ConnexionService;

public class Client
{
	public static void main(String[] args) throws Exception_Exception
	{
		ConnexionService service=new ConnexionService();
		ConnexionWebServ port=service.getConnexionWebServPort();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Tapez QUIT pour eteindre le WebService :");
			String S = sc.nextLine();
			if(S.equals("QUIT") || S == null) break;
			else port.sendMessages(S);
		}while(true);
	}
}
