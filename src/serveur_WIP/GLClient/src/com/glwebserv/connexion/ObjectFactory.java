
package com.glwebserv.connexion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.glwebserv.connexion package. 
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

    private final static QName _SendMessages_QNAME = new QName("http://Connexion.GLWebServ.com", "sendMessages");
    private final static QName _NewRunner_QNAME = new QName("http://Connexion.GLWebServ.com", "newRunner");
    private final static QName _Exception_QNAME = new QName("http://Connexion.GLWebServ.com", "Exception");
    private final static QName _NewRunnerResponse_QNAME = new QName("http://Connexion.GLWebServ.com", "newRunnerResponse");
    private final static QName _GetAdminResponse_QNAME = new QName("http://Connexion.GLWebServ.com", "getAdminResponse");
    private final static QName _SendMessagesResponse_QNAME = new QName("http://Connexion.GLWebServ.com", "sendMessagesResponse");
    private final static QName _GetAdmin_QNAME = new QName("http://Connexion.GLWebServ.com", "getAdmin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.glwebserv.connexion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewRunnerResponse }
     * 
     */
    public NewRunnerResponse createNewRunnerResponse() {
        return new NewRunnerResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetAdminResponse }
     * 
     */
    public GetAdminResponse createGetAdminResponse() {
        return new GetAdminResponse();
    }

    /**
     * Create an instance of {@link GetAdmin }
     * 
     */
    public GetAdmin createGetAdmin() {
        return new GetAdmin();
    }

    /**
     * Create an instance of {@link SendMessagesResponse }
     * 
     */
    public SendMessagesResponse createSendMessagesResponse() {
        return new SendMessagesResponse();
    }

    /**
     * Create an instance of {@link SendMessages }
     * 
     */
    public SendMessages createSendMessages() {
        return new SendMessages();
    }

    /**
     * Create an instance of {@link NewRunner }
     * 
     */
    public NewRunner createNewRunner() {
        return new NewRunner();
    }

    /**
     * Create an instance of {@link Administrator }
     * 
     */
    public Administrator createAdministrator() {
        return new Administrator();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Connexion.GLWebServ.com", name = "sendMessages")
    public JAXBElement<SendMessages> createSendMessages(SendMessages value) {
        return new JAXBElement<SendMessages>(_SendMessages_QNAME, SendMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRunner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Connexion.GLWebServ.com", name = "newRunner")
    public JAXBElement<NewRunner> createNewRunner(NewRunner value) {
        return new JAXBElement<NewRunner>(_NewRunner_QNAME, NewRunner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Connexion.GLWebServ.com", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRunnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Connexion.GLWebServ.com", name = "newRunnerResponse")
    public JAXBElement<NewRunnerResponse> createNewRunnerResponse(NewRunnerResponse value) {
        return new JAXBElement<NewRunnerResponse>(_NewRunnerResponse_QNAME, NewRunnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Connexion.GLWebServ.com", name = "getAdminResponse")
    public JAXBElement<GetAdminResponse> createGetAdminResponse(GetAdminResponse value) {
        return new JAXBElement<GetAdminResponse>(_GetAdminResponse_QNAME, GetAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Connexion.GLWebServ.com", name = "sendMessagesResponse")
    public JAXBElement<SendMessagesResponse> createSendMessagesResponse(SendMessagesResponse value) {
        return new JAXBElement<SendMessagesResponse>(_SendMessagesResponse_QNAME, SendMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Connexion.GLWebServ.com", name = "getAdmin")
    public JAXBElement<GetAdmin> createGetAdmin(GetAdmin value) {
        return new JAXBElement<GetAdmin>(_GetAdmin_QNAME, GetAdmin.class, null, value);
    }

}
