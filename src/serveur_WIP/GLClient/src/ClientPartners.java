import java.util.Scanner;

import com.glwebserv.partners.PartnersService;
import com.glwebserv.partners.PartnersWebServ;

public class ClientPartners
{
	public static void main(String[] args)
	{
		PartnersService service=new PartnersService();
		PartnersWebServ port=service.getPartnersWebServPort();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Tapez QUIT pour eteindre le WebService :");
			String S = sc.nextLine();
			if(S.equals("QUIT") || S == null) break;
			for (String partner : port.getPartnersList().split("\n"))
			{
				System.out.println(partner+ " "+port.getPicture(partner)+" "+port.getName(partner));
			}
		}while(true);
	}
}
