package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Area {

	@WebMethod
	public double square(@WebParam(name="side") double side)
	{
		System.out.println("square" + side);
		return side*side;
	}

	@WebMethod
	public double rectangle(@WebParam(name="length") double length,@WebParam(name="breadth") double breadth)
	{
		System.out.println("rectangle" + length + breadth);
		return length * breadth;
	}

	public static void main(String[] args) {
		Area area = new Area();
		String url = "http://localhost:8090/area"; // end point of webservice.
		System.out.println(url+"?wsdl");
		Endpoint.publish(url, area);  // publishing the webservice
	}
}