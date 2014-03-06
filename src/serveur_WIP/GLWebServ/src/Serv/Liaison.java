package Serv;

import java.util.Date;

import javax.jms.ConnectionFactory;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.jms.JmsConsumer;
import org.apache.camel.component.jms.JmsEndpoint;
import org.apache.camel.impl.DefaultCamelContext;

public class Liaison
{
	private JmsConsumer consumer;
	private ProducerTemplate pt;

	public Liaison() throws Exception
	{
		// Initialise les attributs connectionFactory et destination
		Context jndiContext=new InitialContext();

		ConnectionFactory connectionFactory = (ConnectionFactory) jndiContext.lookup("connectionFactory");
		CamelContext context = new DefaultCamelContext();
		context.addComponent("jms-test", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		pt=context.createProducerTemplate();

		JmsEndpoint responseEndPoint = (JmsEndpoint)context.getEndpoint("jms-test:fournisseur.responseQueue");
		consumer = responseEndPoint.createConsumer
		(
			new Processor()
			{
				public void process(Exchange e)
				throws Exception
				{
					System.out.print((new Date()) +" - " + e.getIn());
					if(e.getIn().getBody()!=null)
						System.out.println(" :\n" + e.getIn().getBody());
					else
						System.out.println(".");
				}
			}
		);
		consumer.start();
		pt.sendBody("jms-test:fournisseur.requestQueue", "USE sql331733");
	}

	public void sendMessages(String S) throws Exception
	{
		pt.sendBody("jms-test:fournisseur.requestQueue", S);
	}

	public void finish()
	{
		System.out.println("WebService Terminated.");
		try
		{ consumer.stop(); }
		catch (Exception e)
		{ e.printStackTrace(); }
	}
}
