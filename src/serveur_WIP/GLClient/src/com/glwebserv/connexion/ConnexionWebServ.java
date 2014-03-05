package com.glwebserv.connexion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2014-02-28T00:51:46.434+01:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://Connexion.GLWebServ.com", name = "ConnexionWebServ")
@XmlSeeAlso({ObjectFactory.class})
public interface ConnexionWebServ {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://Connexion.GLWebServ.com/ConnexionWebServ/getAdminRequest", output = "http://Connexion.GLWebServ.com/ConnexionWebServ/getAdminResponse")
    @RequestWrapper(localName = "getAdmin", targetNamespace = "http://Connexion.GLWebServ.com", className = "com.glwebserv.connexion.GetAdmin")
    @WebMethod
    @ResponseWrapper(localName = "getAdminResponse", targetNamespace = "http://Connexion.GLWebServ.com", className = "com.glwebserv.connexion.GetAdminResponse")
    public com.glwebserv.connexion.Administrator getAdmin();

    @Action(input = "http://Connexion.GLWebServ.com/ConnexionWebServ/sendMessagesRequest", output = "http://Connexion.GLWebServ.com/ConnexionWebServ/sendMessagesResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://Connexion.GLWebServ.com/ConnexionWebServ/sendMessages/Fault/Exception")})
    @RequestWrapper(localName = "sendMessages", targetNamespace = "http://Connexion.GLWebServ.com", className = "com.glwebserv.connexion.SendMessages")
    @WebMethod
    @ResponseWrapper(localName = "sendMessagesResponse", targetNamespace = "http://Connexion.GLWebServ.com", className = "com.glwebserv.connexion.SendMessagesResponse")
    public void sendMessages(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    ) throws Exception_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://Connexion.GLWebServ.com/ConnexionWebServ/newRunnerRequest", output = "http://Connexion.GLWebServ.com/ConnexionWebServ/newRunnerResponse")
    @RequestWrapper(localName = "newRunner", targetNamespace = "http://Connexion.GLWebServ.com", className = "com.glwebserv.connexion.NewRunner")
    @WebMethod
    @ResponseWrapper(localName = "newRunnerResponse", targetNamespace = "http://Connexion.GLWebServ.com", className = "com.glwebserv.connexion.NewRunnerResponse")
    public boolean newRunner(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );
}