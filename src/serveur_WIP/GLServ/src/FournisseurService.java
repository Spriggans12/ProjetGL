import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jms.ConnectionFactory;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.jms.JmsMessage;
import org.apache.camel.impl.DefaultCamelContext;

import SQLClient.SQLClientExe;


public class FournisseurService
{
	public static void main(String[] args)
	{
		final SQLClientExe SQLCli = new SQLClientExe("//sql3.freesqldatabase.com", "sql331733", "dP3!fH1%");
		if (SQLCli.connect())
		{
			try
			{
				Context jndiContext = new InitialContext();
				ConnectionFactory connectionFactory = (ConnectionFactory) jndiContext.lookup("connectionFactory");
				CamelContext context = new DefaultCamelContext();
				context.addComponent("jms-test", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
				context.addRoutes
				(
					new RouteBuilder()
					{
						public void configure() throws Exception
						{
							from("jms-test:fournisseur.requestQueue")
							.process
							(
								new Processor()
								{
									public void process(Exchange e) throws Exception
									{
										JmsMessage fileIn=(JmsMessage) e.getIn();
										System.out.println("Request: " + fileIn.getBody(String.class));
									}
								}
							)
							.process
							(
								new Processor()
								{
									public void process(Exchange e) throws Exception
									{
										JmsMessage fileIn=(JmsMessage) e.getIn();
										e.setOut(fileIn);
										try
										{
											SQLCli.execute(fileIn.getBody(String.class));
											fileIn.setBody(null);
										}
										catch (SQLException ex)
										{
											Logger.getLogger(SQLClientExe.class.getName()).log(Level.SEVERE, null, ex);
											fileIn.setBody(ex.getMessage());
										}
										e.getIn().setHeader("JMSCorrelationID", e.getIn().getHeader("JMSMessageID"));
										//e.setExchangeId(e.getExchangeId());
									}
								}
							)
							.to("jms-test:fournisseur.responseQueue");
						}
					}
				);
				context.start();
				Scanner sc = new Scanner(System.in);
				while(true)
				{
					String S = sc.nextLine();
					if(S.equals("QUIT") || S == null) break;
				}
				context.stop();
			}
			catch (Throwable t)
			{
				t.printStackTrace();
			}
		}
		else
		{
			System.out.println("Mysql connection failed !!!");
		}
		SQLCli.close();
	}
}
