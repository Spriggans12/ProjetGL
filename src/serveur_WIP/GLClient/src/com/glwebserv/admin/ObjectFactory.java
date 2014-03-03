
package com.glwebserv.admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.glwebserv.admin package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreatePartner_QNAME = new QName("http://Admin.GLWebServ.com", "CreatePartner");
    private final static QName _GetPartners_QNAME = new QName("http://Admin.GLWebServ.com", "getPartners");
    private final static QName _ConnectResponse_QNAME = new QName("http://Admin.GLWebServ.com", "ConnectResponse");
    private final static QName _CreatePartnerResponse_QNAME = new QName("http://Admin.GLWebServ.com", "CreatePartnerResponse");
    private final static QName _Exception_QNAME = new QName("http://Admin.GLWebServ.com", "Exception");
    private final static QName _Connect_QNAME = new QName("http://Admin.GLWebServ.com", "Connect");
    private final static QName _Run_QNAME = new QName("http://Admin.GLWebServ.com", "run");
    private final static QName _CreatePartnerWithName_QNAME = new QName("http://Admin.GLWebServ.com", "CreatePartnerWithName");
    private final static QName _RunResponse_QNAME = new QName("http://Admin.GLWebServ.com", "runResponse");
    private final static QName _CreatePartnerWithNameResponse_QNAME = new QName("http://Admin.GLWebServ.com", "CreatePartnerWithNameResponse");
    private final static QName _GetPartnersResponse_QNAME = new QName("http://Admin.GLWebServ.com", "getPartnersResponse");
    private final static QName _NoSuchAlgorithmException_QNAME = new QName("http://Admin.GLWebServ.com", "NoSuchAlgorithmException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.glwebserv.admin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Connect }
     * 
     */
    public Connect createConnect() {
        return new Connect();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link CreatePartnerResponse }
     * 
     */
    public CreatePartnerResponse createCreatePartnerResponse() {
        return new CreatePartnerResponse();
    }

    /**
     * Create an instance of {@link ConnectResponse }
     * 
     */
    public ConnectResponse createConnectResponse() {
        return new ConnectResponse();
    }

    /**
     * Create an instance of {@link GetPartners }
     * 
     */
    public GetPartners createGetPartners() {
        return new GetPartners();
    }

    /**
     * Create an instance of {@link CreatePartner }
     * 
     */
    public CreatePartner createCreatePartner() {
        return new CreatePartner();
    }

    /**
     * Create an instance of {@link NoSuchAlgorithmException }
     * 
     */
    public NoSuchAlgorithmException createNoSuchAlgorithmException() {
        return new NoSuchAlgorithmException();
    }

    /**
     * Create an instance of {@link GetPartnersResponse }
     * 
     */
    public GetPartnersResponse createGetPartnersResponse() {
        return new GetPartnersResponse();
    }

    /**
     * Create an instance of {@link CreatePartnerWithNameResponse }
     * 
     */
    public CreatePartnerWithNameResponse createCreatePartnerWithNameResponse() {
        return new CreatePartnerWithNameResponse();
    }

    /**
     * Create an instance of {@link RunResponse }
     * 
     */
    public RunResponse createRunResponse() {
        return new RunResponse();
    }

    /**
     * Create an instance of {@link CreatePartnerWithName }
     * 
     */
    public CreatePartnerWithName createCreatePartnerWithName() {
        return new CreatePartnerWithName();
    }

    /**
     * Create an instance of {@link Run }
     * 
     */
    public Run createRun() {
        return new Run();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "CreatePartner")
    public JAXBElement<CreatePartner> createCreatePartner(CreatePartner value) {
        return new JAXBElement<CreatePartner>(_CreatePartner_QNAME, CreatePartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartners }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "getPartners")
    public JAXBElement<GetPartners> createGetPartners(GetPartners value) {
        return new JAXBElement<GetPartners>(_GetPartners_QNAME, GetPartners.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "ConnectResponse")
    public JAXBElement<ConnectResponse> createConnectResponse(ConnectResponse value) {
        return new JAXBElement<ConnectResponse>(_ConnectResponse_QNAME, ConnectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "CreatePartnerResponse")
    public JAXBElement<CreatePartnerResponse> createCreatePartnerResponse(CreatePartnerResponse value) {
        return new JAXBElement<CreatePartnerResponse>(_CreatePartnerResponse_QNAME, CreatePartnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connect }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "Connect")
    public JAXBElement<Connect> createConnect(Connect value) {
        return new JAXBElement<Connect>(_Connect_QNAME, Connect.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Run }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "run")
    public JAXBElement<Run> createRun(Run value) {
        return new JAXBElement<Run>(_Run_QNAME, Run.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartnerWithName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "CreatePartnerWithName")
    public JAXBElement<CreatePartnerWithName> createCreatePartnerWithName(CreatePartnerWithName value) {
        return new JAXBElement<CreatePartnerWithName>(_CreatePartnerWithName_QNAME, CreatePartnerWithName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "runResponse")
    public JAXBElement<RunResponse> createRunResponse(RunResponse value) {
        return new JAXBElement<RunResponse>(_RunResponse_QNAME, RunResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartnerWithNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "CreatePartnerWithNameResponse")
    public JAXBElement<CreatePartnerWithNameResponse> createCreatePartnerWithNameResponse(CreatePartnerWithNameResponse value) {
        return new JAXBElement<CreatePartnerWithNameResponse>(_CreatePartnerWithNameResponse_QNAME, CreatePartnerWithNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "getPartnersResponse")
    public JAXBElement<GetPartnersResponse> createGetPartnersResponse(GetPartnersResponse value) {
        return new JAXBElement<GetPartnersResponse>(_GetPartnersResponse_QNAME, GetPartnersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchAlgorithmException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Admin.GLWebServ.com", name = "NoSuchAlgorithmException")
    public JAXBElement<NoSuchAlgorithmException> createNoSuchAlgorithmException(NoSuchAlgorithmException value) {
        return new JAXBElement<NoSuchAlgorithmException>(_NoSuchAlgorithmException_QNAME, NoSuchAlgorithmException.class, null, value);
    }

}
