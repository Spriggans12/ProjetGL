package com.glwebserv.partners;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2014-02-28T13:57:28.305+01:00
 * Generated source version: 2.7.7
 * 
 */
@WebServiceClient(name = "PartnersService", 
                  wsdlLocation = "http://localhost:8090/partners?wsdl",
                  targetNamespace = "http://Partners.GLWebServ.com") 
public class PartnersService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Partners.GLWebServ.com", "PartnersService");
    public final static QName PartnersWebServPort = new QName("http://Partners.GLWebServ.com", "PartnersWebServPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8090/partners?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PartnersService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8090/partners?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PartnersService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PartnersService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PartnersService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PartnersService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PartnersService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PartnersService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PartnersWebServ
     */
    @WebEndpoint(name = "PartnersWebServPort")
    public PartnersWebServ getPartnersWebServPort() {
        return super.getPort(PartnersWebServPort, PartnersWebServ.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PartnersWebServ
     */
    @WebEndpoint(name = "PartnersWebServPort")
    public PartnersWebServ getPartnersWebServPort(WebServiceFeature... features) {
        return super.getPort(PartnersWebServPort, PartnersWebServ.class, features);
    }

}