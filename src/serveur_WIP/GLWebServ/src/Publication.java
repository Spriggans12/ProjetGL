import java.util.Scanner;

import javax.xml.ws.Endpoint;

import Serv.Connexion;

public class Publication
{
	public static void main(String[] args)
	{
		try
		{
			Connexion producer = new Connexion();
			//Endpoint endpointConnexion = Endpoint.create(producer);
			//endpointConnexion.publish("http://localhost:8090/connexion");
			Endpoint endpointAdmin = Endpoint.create(producer.getAdmin());
			endpointAdmin.publish("http://localhost:8090/connexionAdmin");
			Endpoint endpointRunns = Endpoint.create(producer.getRunners());
			endpointRunns.publish("http://localhost:8090/runners");
			Endpoint endpointParts = Endpoint.create(producer.getPartners());
			endpointParts.publish("http://localhost:8090/partners");
			new Thread(producer.getAdmin()).start();
			Scanner sc = new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter QUIT to exit or write an SQL request :");
				String S = sc.nextLine();
				if(S.equals("QUIT") || S == null) break;
				else producer.sendMessages(S);
			}
			endpointParts.stop();
			endpointRunns.stop();
			endpointAdmin.stop();
			//endpointConnexion.stop();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
}