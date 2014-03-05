
package com.glwebserv.admin;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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
 * 2014-02-28T13:57:31.338+01:00
 * Generated source version: 2.7.7
 * 
 */
public final class AdminWebServ_AdminWebServPort_Client {

    private static final QName SERVICE_NAME = new QName("http://Admin.GLWebServ.com", "AdministratorService");

    private AdminWebServ_AdminWebServPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AdministratorService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AdministratorService ss = new AdministratorService(wsdlURL, SERVICE_NAME);
        AdminWebServ port = ss.getAdminWebServPort();  
        
        {
        System.out.println("Invoking run...");
        port.run();


        }
        {
        System.out.println("Invoking getPartners...");
        int _getPartners_arg0 = 0;
        java.lang.String _getPartners__return = port.getPartners(_getPartners_arg0);
        System.out.println("getPartners.result=" + _getPartners__return);


        }
        {
        System.out.println("Invoking createPartner...");
        int _createPartner_arg0 = 0;
        java.lang.String _createPartner_arg1 = "";
        java.lang.String _createPartner_arg2 = "";
        try {
            boolean _createPartner__return = port.createPartner(_createPartner_arg0, _createPartner_arg1, _createPartner_arg2);
            System.out.println("createPartner.result=" + _createPartner__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking connect...");
        java.lang.String _connect_arg0 = "";
        try {
            int _connect__return = port.connect(_connect_arg0);
            System.out.println("connect.result=" + _connect__return);

        } catch (NoSuchAlgorithmException_Exception e) { 
            System.out.println("Expected exception: NoSuchAlgorithmException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createPartnerWithName...");
        int _createPartnerWithName_arg0 = 0;
        java.lang.String _createPartnerWithName_arg1 = "";
        java.lang.String _createPartnerWithName_arg2 = "";
        java.lang.String _createPartnerWithName_arg3 = "";
        try {
            boolean _createPartnerWithName__return = port.createPartnerWithName(_createPartnerWithName_arg0, _createPartnerWithName_arg1, _createPartnerWithName_arg2, _createPartnerWithName_arg3);
            System.out.println("createPartnerWithName.result=" + _createPartnerWithName__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}