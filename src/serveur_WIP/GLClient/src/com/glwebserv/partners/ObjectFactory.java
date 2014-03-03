
package com.glwebserv.partners;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.glwebserv.partners package. 
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

    private final static QName _GetName_QNAME = new QName("http://Partners.GLWebServ.com", "getName");
    private final static QName _GetNameResponse_QNAME = new QName("http://Partners.GLWebServ.com", "getNameResponse");
    private final static QName _GetPicture_QNAME = new QName("http://Partners.GLWebServ.com", "getPicture");
    private final static QName _GetPartnersList_QNAME = new QName("http://Partners.GLWebServ.com", "getPartnersList");
    private final static QName _GetPartnersListResponse_QNAME = new QName("http://Partners.GLWebServ.com", "getPartnersListResponse");
    private final static QName _GetPictureResponse_QNAME = new QName("http://Partners.GLWebServ.com", "getPictureResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.glwebserv.partners
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPicture }
     * 
     */
    public GetPicture createGetPicture() {
        return new GetPicture();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetPictureResponse }
     * 
     */
    public GetPictureResponse createGetPictureResponse() {
        return new GetPictureResponse();
    }

    /**
     * Create an instance of {@link GetPartnersList }
     * 
     */
    public GetPartnersList createGetPartnersList() {
        return new GetPartnersList();
    }

    /**
     * Create an instance of {@link GetPartnersListResponse }
     * 
     */
    public GetPartnersListResponse createGetPartnersListResponse() {
        return new GetPartnersListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Partners.GLWebServ.com", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Partners.GLWebServ.com", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPicture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Partners.GLWebServ.com", name = "getPicture")
    public JAXBElement<GetPicture> createGetPicture(GetPicture value) {
        return new JAXBElement<GetPicture>(_GetPicture_QNAME, GetPicture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnersList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Partners.GLWebServ.com", name = "getPartnersList")
    public JAXBElement<GetPartnersList> createGetPartnersList(GetPartnersList value) {
        return new JAXBElement<GetPartnersList>(_GetPartnersList_QNAME, GetPartnersList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnersListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Partners.GLWebServ.com", name = "getPartnersListResponse")
    public JAXBElement<GetPartnersListResponse> createGetPartnersListResponse(GetPartnersListResponse value) {
        return new JAXBElement<GetPartnersListResponse>(_GetPartnersListResponse_QNAME, GetPartnersListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPictureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Partners.GLWebServ.com", name = "getPictureResponse")
    public JAXBElement<GetPictureResponse> createGetPictureResponse(GetPictureResponse value) {
        return new JAXBElement<GetPictureResponse>(_GetPictureResponse_QNAME, GetPictureResponse.class, null, value);
    }

}
