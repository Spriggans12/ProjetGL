
package com.glwebserv.admin;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2014-02-28T13:57:31.465+01:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "NoSuchAlgorithmException", targetNamespace = "http://Admin.GLWebServ.com")
public class NoSuchAlgorithmException_Exception extends java.lang.Exception {
    
    private com.glwebserv.admin.NoSuchAlgorithmException noSuchAlgorithmException;

    public NoSuchAlgorithmException_Exception() {
        super();
    }
    
    public NoSuchAlgorithmException_Exception(String message) {
        super(message);
    }
    
    public NoSuchAlgorithmException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchAlgorithmException_Exception(String message, com.glwebserv.admin.NoSuchAlgorithmException noSuchAlgorithmException) {
        super(message);
        this.noSuchAlgorithmException = noSuchAlgorithmException;
    }

    public NoSuchAlgorithmException_Exception(String message, com.glwebserv.admin.NoSuchAlgorithmException noSuchAlgorithmException, Throwable cause) {
        super(message, cause);
        this.noSuchAlgorithmException = noSuchAlgorithmException;
    }

    public com.glwebserv.admin.NoSuchAlgorithmException getFaultInfo() {
        return this.noSuchAlgorithmException;
    }
}
