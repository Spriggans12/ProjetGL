import java.util.Scanner;

import com.glwebserv.admin.AdminWebServ;
import com.glwebserv.admin.AdministratorService;
import com.glwebserv.admin.Exception_Exception;
import com.glwebserv.admin.NoSuchAlgorithmException_Exception;

public class ClientAdmin
{
	public static void main(String[] args) throws Exception_Exception, NoSuchAlgorithmException_Exception
	{
		AdministratorService service=new AdministratorService();
		AdminWebServ port=service.getAdminWebServPort();
		int ticket=port.connect("Password");
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Tapez QUIT pour eteindre le WebService :");
			String S = sc.nextLine();
			if(S.equals("QUIT") || S == null) break;
			port.createPartner(ticket,"http://what.the.fuck", "http://what.the.fuck/wtf.wtf");
			port.createPartnerWithName(ticket,"http://fuck.dat.shit", "http://fuck.dat.shit/fds.fds","FuckDatShit");
			System.out.println(port.getPartners(ticket));
		}while(true);
	}
}
