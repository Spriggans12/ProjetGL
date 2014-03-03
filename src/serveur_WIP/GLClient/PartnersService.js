//
// Definitions for schema: http://Partners.GLWebServ.com
//  http://localhost:8090/partners?xsd=1
//
//
// Constructor for XML Schema item {http://Partners.GLWebServ.com}getNameResponse
//
function Partners_GLWebServ_com_getNameResponse () {
    this.typeMarker = 'Partners_GLWebServ_com_getNameResponse';
    this._return = null;
}

//
// accessor is Partners_GLWebServ_com_getNameResponse.prototype.getReturn
// element get for return
// - element type is {http://www.w3.org/2001/XMLSchema}string
// - optional element
//
// element set for return
// setter function is is Partners_GLWebServ_com_getNameResponse.prototype.setReturn
//
function Partners_GLWebServ_com_getNameResponse_getReturn() { return this._return;}

Partners_GLWebServ_com_getNameResponse.prototype.getReturn = Partners_GLWebServ_com_getNameResponse_getReturn;

function Partners_GLWebServ_com_getNameResponse_setReturn(value) { this._return = value;}

Partners_GLWebServ_com_getNameResponse.prototype.setReturn = Partners_GLWebServ_com_getNameResponse_setReturn;
//
// Serialize {http://Partners.GLWebServ.com}getNameResponse
//
function Partners_GLWebServ_com_getNameResponse_serialize(cxfjsutils, elementName, extraNamespaces) {
    var xml = '';
    if (elementName != null) {
     xml = xml + '<';
     xml = xml + elementName;
     if (extraNamespaces) {
      xml = xml + ' ' + extraNamespaces;
     }
     xml = xml + '>';
    }
    // block for local variables
    {
     if (this._return != null) {
      xml = xml + '<return>';
      xml = xml + cxfjsutils.escapeXmlEntities(this._return);
      xml = xml + '</return>';
     }
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

Partners_GLWebServ_com_getNameResponse.prototype.serialize = Partners_GLWebServ_com_getNameResponse_serialize;

function Partners_GLWebServ_com_getNameResponse_deserialize (cxfjsutils, element) {
    var newobject = new Partners_GLWebServ_com_getNameResponse();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing return');
    if (curElement != null && cxfjsutils.isNodeNamedNS(curElement, '', 'return')) {
     var value = null;
     if (!cxfjsutils.isElementNil(curElement)) {
      value = cxfjsutils.getNodeText(curElement);
      item = value;
     }
     newobject.setReturn(item);
     var item = null;
     if (curElement != null) {
      curElement = cxfjsutils.getNextElementSibling(curElement);
     }
    }
    return newobject;
}

//
// Constructor for XML Schema item {http://Partners.GLWebServ.com}getName
//
function Partners_GLWebServ_com_getName () {
    this.typeMarker = 'Partners_GLWebServ_com_getName';
    this._arg0 = null;
}

//
// accessor is Partners_GLWebServ_com_getName.prototype.getArg0
// element get for arg0
// - element type is {http://www.w3.org/2001/XMLSchema}string
// - optional element
//
// element set for arg0
// setter function is is Partners_GLWebServ_com_getName.prototype.setArg0
//
function Partners_GLWebServ_com_getName_getArg0() { return this._arg0;}

Partners_GLWebServ_com_getName.prototype.getArg0 = Partners_GLWebServ_com_getName_getArg0;

function Partners_GLWebServ_com_getName_setArg0(value) { this._arg0 = value;}

Partners_GLWebServ_com_getName.prototype.setArg0 = Partners_GLWebServ_com_getName_setArg0;
//
// Serialize {http://Partners.GLWebServ.com}getName
//
function Partners_GLWebServ_com_getName_serialize(cxfjsutils, elementName, extraNamespaces) {
    var xml = '';
    if (elementName != null) {
     xml = xml + '<';
     xml = xml + elementName;
     if (extraNamespaces) {
      xml = xml + ' ' + extraNamespaces;
     }
     xml = xml + '>';
    }
    // block for local variables
    {
     if (this._arg0 != null) {
      xml = xml + '<arg0>';
      xml = xml + cxfjsutils.escapeXmlEntities(this._arg0);
      xml = xml + '</arg0>';
     }
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

Partners_GLWebServ_com_getName.prototype.serialize = Partners_GLWebServ_com_getName_serialize;

function Partners_GLWebServ_com_getName_deserialize (cxfjsutils, element) {
    var newobject = new Partners_GLWebServ_com_getName();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing arg0');
    if (curElement != null && cxfjsutils.isNodeNamedNS(curElement, '', 'arg0')) {
     var value = null;
     if (!cxfjsutils.isElementNil(curElement)) {
      value = cxfjsutils.getNodeText(curElement);
      item = value;
     }
     newobject.setArg0(item);
     var item = null;
     if (curElement != null) {
      curElement = cxfjsutils.getNextElementSibling(curElement);
     }
    }
    return newobject;
}

//
// Constructor for XML Schema item {http://Partners.GLWebServ.com}getPicture
//
function Partners_GLWebServ_com_getPicture () {
    this.typeMarker = 'Partners_GLWebServ_com_getPicture';
    this._arg0 = null;
}

//
// accessor is Partners_GLWebServ_com_getPicture.prototype.getArg0
// element get for arg0
// - element type is {http://www.w3.org/2001/XMLSchema}string
// - optional element
//
// element set for arg0
// setter function is is Partners_GLWebServ_com_getPicture.prototype.setArg0
//
function Partners_GLWebServ_com_getPicture_getArg0() { return this._arg0;}

Partners_GLWebServ_com_getPicture.prototype.getArg0 = Partners_GLWebServ_com_getPicture_getArg0;

function Partners_GLWebServ_com_getPicture_setArg0(value) { this._arg0 = value;}

Partners_GLWebServ_com_getPicture.prototype.setArg0 = Partners_GLWebServ_com_getPicture_setArg0;
//
// Serialize {http://Partners.GLWebServ.com}getPicture
//
function Partners_GLWebServ_com_getPicture_serialize(cxfjsutils, elementName, extraNamespaces) {
    var xml = '';
    if (elementName != null) {
     xml = xml + '<';
     xml = xml + elementName;
     if (extraNamespaces) {
      xml = xml + ' ' + extraNamespaces;
     }
     xml = xml + '>';
    }
    // block for local variables
    {
     if (this._arg0 != null) {
      xml = xml + '<arg0>';
      xml = xml + cxfjsutils.escapeXmlEntities(this._arg0);
      xml = xml + '</arg0>';
     }
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

Partners_GLWebServ_com_getPicture.prototype.serialize = Partners_GLWebServ_com_getPicture_serialize;

function Partners_GLWebServ_com_getPicture_deserialize (cxfjsutils, element) {
    var newobject = new Partners_GLWebServ_com_getPicture();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing arg0');
    if (curElement != null && cxfjsutils.isNodeNamedNS(curElement, '', 'arg0')) {
     var value = null;
     if (!cxfjsutils.isElementNil(curElement)) {
      value = cxfjsutils.getNodeText(curElement);
      item = value;
     }
     newobject.setArg0(item);
     var item = null;
     if (curElement != null) {
      curElement = cxfjsutils.getNextElementSibling(curElement);
     }
    }
    return newobject;
}

//
// Constructor for XML Schema item {http://Partners.GLWebServ.com}getPartnersList
//
function Partners_GLWebServ_com_getPartnersList () {
    this.typeMarker = 'Partners_GLWebServ_com_getPartnersList';
}

//
// Serialize {http://Partners.GLWebServ.com}getPartnersList
//
function Partners_GLWebServ_com_getPartnersList_serialize(cxfjsutils, elementName, extraNamespaces) {
    var xml = '';
    if (elementName != null) {
     xml = xml + '<';
     xml = xml + elementName;
     if (extraNamespaces) {
      xml = xml + ' ' + extraNamespaces;
     }
     xml = xml + '>';
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

Partners_GLWebServ_com_getPartnersList.prototype.serialize = Partners_GLWebServ_com_getPartnersList_serialize;

function Partners_GLWebServ_com_getPartnersList_deserialize (cxfjsutils, element) {
    var newobject = new Partners_GLWebServ_com_getPartnersList();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    return newobject;
}

//
// Constructor for XML Schema item {http://Partners.GLWebServ.com}getPartnersListResponse
//
function Partners_GLWebServ_com_getPartnersListResponse () {
    this.typeMarker = 'Partners_GLWebServ_com_getPartnersListResponse';
    this._return = null;
}

//
// accessor is Partners_GLWebServ_com_getPartnersListResponse.prototype.getReturn
// element get for return
// - element type is {http://www.w3.org/2001/XMLSchema}string
// - optional element
//
// element set for return
// setter function is is Partners_GLWebServ_com_getPartnersListResponse.prototype.setReturn
//
function Partners_GLWebServ_com_getPartnersListResponse_getReturn() { return this._return;}

Partners_GLWebServ_com_getPartnersListResponse.prototype.getReturn = Partners_GLWebServ_com_getPartnersListResponse_getReturn;

function Partners_GLWebServ_com_getPartnersListResponse_setReturn(value) { this._return = value;}

Partners_GLWebServ_com_getPartnersListResponse.prototype.setReturn = Partners_GLWebServ_com_getPartnersListResponse_setReturn;
//
// Serialize {http://Partners.GLWebServ.com}getPartnersListResponse
//
function Partners_GLWebServ_com_getPartnersListResponse_serialize(cxfjsutils, elementName, extraNamespaces) {
    var xml = '';
    if (elementName != null) {
     xml = xml + '<';
     xml = xml + elementName;
     if (extraNamespaces) {
      xml = xml + ' ' + extraNamespaces;
     }
     xml = xml + '>';
    }
    // block for local variables
    {
     if (this._return != null) {
      xml = xml + '<return>';
      xml = xml + cxfjsutils.escapeXmlEntities(this._return);
      xml = xml + '</return>';
     }
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

Partners_GLWebServ_com_getPartnersListResponse.prototype.serialize = Partners_GLWebServ_com_getPartnersListResponse_serialize;

function Partners_GLWebServ_com_getPartnersListResponse_deserialize (cxfjsutils, element) {
    var newobject = new Partners_GLWebServ_com_getPartnersListResponse();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing return');
    if (curElement != null && cxfjsutils.isNodeNamedNS(curElement, '', 'return')) {
     var value = null;
     if (!cxfjsutils.isElementNil(curElement)) {
      value = cxfjsutils.getNodeText(curElement);
      item = value;
     }
     newobject.setReturn(item);
     var item = null;
     if (curElement != null) {
      curElement = cxfjsutils.getNextElementSibling(curElement);
     }
    }
    return newobject;
}

//
// Constructor for XML Schema item {http://Partners.GLWebServ.com}getPictureResponse
//
function Partners_GLWebServ_com_getPictureResponse () {
    this.typeMarker = 'Partners_GLWebServ_com_getPictureResponse';
    this._return = null;
}

//
// accessor is Partners_GLWebServ_com_getPictureResponse.prototype.getReturn
// element get for return
// - element type is {http://www.w3.org/2001/XMLSchema}string
// - optional element
//
// element set for return
// setter function is is Partners_GLWebServ_com_getPictureResponse.prototype.setReturn
//
function Partners_GLWebServ_com_getPictureResponse_getReturn() { return this._return;}

Partners_GLWebServ_com_getPictureResponse.prototype.getReturn = Partners_GLWebServ_com_getPictureResponse_getReturn;

function Partners_GLWebServ_com_getPictureResponse_setReturn(value) { this._return = value;}

Partners_GLWebServ_com_getPictureResponse.prototype.setReturn = Partners_GLWebServ_com_getPictureResponse_setReturn;
//
// Serialize {http://Partners.GLWebServ.com}getPictureResponse
//
function Partners_GLWebServ_com_getPictureResponse_serialize(cxfjsutils, elementName, extraNamespaces) {
    var xml = '';
    if (elementName != null) {
     xml = xml + '<';
     xml = xml + elementName;
     if (extraNamespaces) {
      xml = xml + ' ' + extraNamespaces;
     }
     xml = xml + '>';
    }
    // block for local variables
    {
     if (this._return != null) {
      xml = xml + '<return>';
      xml = xml + cxfjsutils.escapeXmlEntities(this._return);
      xml = xml + '</return>';
     }
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

Partners_GLWebServ_com_getPictureResponse.prototype.serialize = Partners_GLWebServ_com_getPictureResponse_serialize;

function Partners_GLWebServ_com_getPictureResponse_deserialize (cxfjsutils, element) {
    var newobject = new Partners_GLWebServ_com_getPictureResponse();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing return');
    if (curElement != null && cxfjsutils.isNodeNamedNS(curElement, '', 'return')) {
     var value = null;
     if (!cxfjsutils.isElementNil(curElement)) {
      value = cxfjsutils.getNodeText(curElement);
      item = value;
     }
     newobject.setReturn(item);
     var item = null;
     if (curElement != null) {
      curElement = cxfjsutils.getNextElementSibling(curElement);
     }
    }
    return newobject;
}

//
// Definitions for schema: null
//  http://localhost:8090/partners?wsdl#types1
//
//
// Definitions for service: {http://Partners.GLWebServ.com}PartnersService
//

// Javascript for {http://Partners.GLWebServ.com}PartnersWebServ

function Partners_GLWebServ_com_PartnersWebServ () {
    this.jsutils = new CxfApacheOrgUtil();
    this.jsutils.interfaceObject = this;
    this.synchronous = false;
    this.url = null;
    this.client = null;
    this.response = null;
    this.globalElementSerializers = [];
    this.globalElementDeserializers = [];
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getPicture'] = Partners_GLWebServ_com_getPicture_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getPicture'] = Partners_GLWebServ_com_getPicture_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getNameResponse'] = Partners_GLWebServ_com_getNameResponse_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getNameResponse'] = Partners_GLWebServ_com_getNameResponse_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getName'] = Partners_GLWebServ_com_getName_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getName'] = Partners_GLWebServ_com_getName_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getPartnersList'] = Partners_GLWebServ_com_getPartnersList_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getPartnersList'] = Partners_GLWebServ_com_getPartnersList_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getPartnersListResponse'] = Partners_GLWebServ_com_getPartnersListResponse_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getPartnersListResponse'] = Partners_GLWebServ_com_getPartnersListResponse_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getPictureResponse'] = Partners_GLWebServ_com_getPictureResponse_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getPictureResponse'] = Partners_GLWebServ_com_getPictureResponse_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getNameResponse'] = Partners_GLWebServ_com_getNameResponse_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getNameResponse'] = Partners_GLWebServ_com_getNameResponse_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getName'] = Partners_GLWebServ_com_getName_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getName'] = Partners_GLWebServ_com_getName_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getPicture'] = Partners_GLWebServ_com_getPicture_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getPicture'] = Partners_GLWebServ_com_getPicture_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getPartnersList'] = Partners_GLWebServ_com_getPartnersList_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getPartnersList'] = Partners_GLWebServ_com_getPartnersList_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getPartnersListResponse'] = Partners_GLWebServ_com_getPartnersListResponse_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getPartnersListResponse'] = Partners_GLWebServ_com_getPartnersListResponse_deserialize;
    this.globalElementSerializers['{http://Partners.GLWebServ.com}getPictureResponse'] = Partners_GLWebServ_com_getPictureResponse_serialize;
    this.globalElementDeserializers['{http://Partners.GLWebServ.com}getPictureResponse'] = Partners_GLWebServ_com_getPictureResponse_deserialize;
}

function Partners_GLWebServ_com_getName_op_onsuccess(client, responseXml) {
    if (client.user_onsuccess) {
     var responseObject = null;
     var element = responseXml.documentElement;
     this.jsutils.trace('responseXml: ' + this.jsutils.traceElementName(element));
     element = this.jsutils.getFirstElementChild(element);
     this.jsutils.trace('first element child: ' + this.jsutils.traceElementName(element));
     while (!this.jsutils.isNodeNamedNS(element, 'http://schemas.xmlsoap.org/soap/envelope/', 'Body')) {
      element = this.jsutils.getNextElementSibling(element);
      if (element == null) {
       throw 'No env:Body in message.'
      }
     }
     element = this.jsutils.getFirstElementChild(element);
     this.jsutils.trace('part element: ' + this.jsutils.traceElementName(element));
     this.jsutils.trace('calling Partners_GLWebServ_com_getNameResponse_deserializeResponse');
     responseObject = Partners_GLWebServ_com_getNameResponse_deserializeResponse(this.jsutils, element);
     client.user_onsuccess(responseObject);
    }
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getName_onsuccess = Partners_GLWebServ_com_getName_op_onsuccess;

function Partners_GLWebServ_com_getName_op_onerror(client) {
    if (client.user_onerror) {
     var httpStatus;
     var httpStatusText;
     try {
      httpStatus = client.req.status;
      httpStatusText = client.req.statusText;
     } catch(e) {
      httpStatus = -1;
      httpStatusText = 'Error opening connection to server';
     }
     client.user_onerror(httpStatus, httpStatusText);
    }
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getName_onerror = Partners_GLWebServ_com_getName_op_onerror;

//
// Operation {http://Partners.GLWebServ.com}getName
// Wrapped operation.
// parameter arg0
// - simple type {http://www.w3.org/2001/XMLSchema}string//
function Partners_GLWebServ_com_getName_op(successCallback, errorCallback, arg0) {
    this.client = new CxfApacheOrgClient(this.jsutils);
    var xml = null;
    var args = new Array(1);
    args[0] = arg0;
    xml = this.getName_serializeInput(this.jsutils, args);
    this.client.user_onsuccess = successCallback;
    this.client.user_onerror = errorCallback;
    var closureThis = this;
    this.client.onsuccess = function(client, responseXml) { closureThis.getName_onsuccess(client, responseXml); };
    this.client.onerror = function(client) { closureThis.getName_onerror(client); };
    var requestHeaders = [];
    requestHeaders['SOAPAction'] = '';
    this.jsutils.trace('synchronous = ' + this.synchronous);
    this.client.request(this.url, xml, null, this.synchronous, requestHeaders);
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getName = Partners_GLWebServ_com_getName_op;

function Partners_GLWebServ_com_getName_serializeInput(cxfjsutils, args) {
    var wrapperObj = new Partners_GLWebServ_com_getName();
    wrapperObj.setArg0(args[0]);
    var xml;
    xml = cxfjsutils.beginSoap11Message("xmlns:jns0='http://Partners.GLWebServ.com' ");
    // block for local variables
    {
     xml = xml + wrapperObj.serialize(cxfjsutils, 'jns0:getName', null);
    }
    xml = xml + cxfjsutils.endSoap11Message();
    return xml;
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getName_serializeInput = Partners_GLWebServ_com_getName_serializeInput;

function Partners_GLWebServ_com_getNameResponse_deserializeResponse(cxfjsutils, partElement) {
    var returnObject = Partners_GLWebServ_com_getNameResponse_deserialize (cxfjsutils, partElement);

    return returnObject;
}
function Partners_GLWebServ_com_getPartnersList_op_onsuccess(client, responseXml) {
    if (client.user_onsuccess) {
     var responseObject = null;
     var element = responseXml.documentElement;
     this.jsutils.trace('responseXml: ' + this.jsutils.traceElementName(element));
     element = this.jsutils.getFirstElementChild(element);
     this.jsutils.trace('first element child: ' + this.jsutils.traceElementName(element));
     while (!this.jsutils.isNodeNamedNS(element, 'http://schemas.xmlsoap.org/soap/envelope/', 'Body')) {
      element = this.jsutils.getNextElementSibling(element);
      if (element == null) {
       throw 'No env:Body in message.'
      }
     }
     element = this.jsutils.getFirstElementChild(element);
     this.jsutils.trace('part element: ' + this.jsutils.traceElementName(element));
     this.jsutils.trace('calling Partners_GLWebServ_com_getPartnersListResponse_deserializeResponse');
     responseObject = Partners_GLWebServ_com_getPartnersListResponse_deserializeResponse(this.jsutils, element);
     client.user_onsuccess(responseObject);
    }
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getPartnersList_onsuccess = Partners_GLWebServ_com_getPartnersList_op_onsuccess;

function Partners_GLWebServ_com_getPartnersList_op_onerror(client) {
    if (client.user_onerror) {
     var httpStatus;
     var httpStatusText;
     try {
      httpStatus = client.req.status;
      httpStatusText = client.req.statusText;
     } catch(e) {
      httpStatus = -1;
      httpStatusText = 'Error opening connection to server';
     }
     client.user_onerror(httpStatus, httpStatusText);
    }
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getPartnersList_onerror = Partners_GLWebServ_com_getPartnersList_op_onerror;

//
// Operation {http://Partners.GLWebServ.com}getPartnersList
// Wrapped operation.
//
function Partners_GLWebServ_com_getPartnersList_op(successCallback, errorCallback) {
    this.client = new CxfApacheOrgClient(this.jsutils);
    var xml = null;
    var args = new Array(0);
    xml = this.getPartnersList_serializeInput(this.jsutils, args);
    this.client.user_onsuccess = successCallback;
    this.client.user_onerror = errorCallback;
    var closureThis = this;
    this.client.onsuccess = function(client, responseXml) { closureThis.getPartnersList_onsuccess(client, responseXml); };
    this.client.onerror = function(client) { closureThis.getPartnersList_onerror(client); };
    var requestHeaders = [];
    requestHeaders['SOAPAction'] = '';
    this.jsutils.trace('synchronous = ' + this.synchronous);
    this.client.request(this.url, xml, null, this.synchronous, requestHeaders);
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getPartnersList = Partners_GLWebServ_com_getPartnersList_op;

function Partners_GLWebServ_com_getPartnersList_serializeInput(cxfjsutils, args) {
    var wrapperObj = new Partners_GLWebServ_com_getPartnersList();
    var xml;
    xml = cxfjsutils.beginSoap11Message("xmlns:jns0='http://Partners.GLWebServ.com' ");
    // block for local variables
    {
     xml = xml + wrapperObj.serialize(cxfjsutils, 'jns0:getPartnersList', null);
    }
    xml = xml + cxfjsutils.endSoap11Message();
    return xml;
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getPartnersList_serializeInput = Partners_GLWebServ_com_getPartnersList_serializeInput;

function Partners_GLWebServ_com_getPartnersListResponse_deserializeResponse(cxfjsutils, partElement) {
    var returnObject = Partners_GLWebServ_com_getPartnersListResponse_deserialize (cxfjsutils, partElement);

    return returnObject;
}
function Partners_GLWebServ_com_getPicture_op_onsuccess(client, responseXml) {
    if (client.user_onsuccess) {
     var responseObject = null;
     var element = responseXml.documentElement;
     this.jsutils.trace('responseXml: ' + this.jsutils.traceElementName(element));
     element = this.jsutils.getFirstElementChild(element);
     this.jsutils.trace('first element child: ' + this.jsutils.traceElementName(element));
     while (!this.jsutils.isNodeNamedNS(element, 'http://schemas.xmlsoap.org/soap/envelope/', 'Body')) {
      element = this.jsutils.getNextElementSibling(element);
      if (element == null) {
       throw 'No env:Body in message.'
      }
     }
     element = this.jsutils.getFirstElementChild(element);
     this.jsutils.trace('part element: ' + this.jsutils.traceElementName(element));
     this.jsutils.trace('calling Partners_GLWebServ_com_getPictureResponse_deserializeResponse');
     responseObject = Partners_GLWebServ_com_getPictureResponse_deserializeResponse(this.jsutils, element);
     client.user_onsuccess(responseObject);
    }
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getPicture_onsuccess = Partners_GLWebServ_com_getPicture_op_onsuccess;

function Partners_GLWebServ_com_getPicture_op_onerror(client) {
    if (client.user_onerror) {
     var httpStatus;
     var httpStatusText;
     try {
      httpStatus = client.req.status;
      httpStatusText = client.req.statusText;
     } catch(e) {
      httpStatus = -1;
      httpStatusText = 'Error opening connection to server';
     }
     client.user_onerror(httpStatus, httpStatusText);
    }
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getPicture_onerror = Partners_GLWebServ_com_getPicture_op_onerror;

//
// Operation {http://Partners.GLWebServ.com}getPicture
// Wrapped operation.
// parameter arg0
// - simple type {http://www.w3.org/2001/XMLSchema}string//
function Partners_GLWebServ_com_getPicture_op(successCallback, errorCallback, arg0) {
    this.client = new CxfApacheOrgClient(this.jsutils);
    var xml = null;
    var args = new Array(1);
    args[0] = arg0;
    xml = this.getPicture_serializeInput(this.jsutils, args);
    this.client.user_onsuccess = successCallback;
    this.client.user_onerror = errorCallback;
    var closureThis = this;
    this.client.onsuccess = function(client, responseXml) { closureThis.getPicture_onsuccess(client, responseXml); };
    this.client.onerror = function(client) { closureThis.getPicture_onerror(client); };
    var requestHeaders = [];
    requestHeaders['SOAPAction'] = '';
    this.jsutils.trace('synchronous = ' + this.synchronous);
    this.client.request(this.url, xml, null, this.synchronous, requestHeaders);
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getPicture = Partners_GLWebServ_com_getPicture_op;

function Partners_GLWebServ_com_getPicture_serializeInput(cxfjsutils, args) {
    var wrapperObj = new Partners_GLWebServ_com_getPicture();
    wrapperObj.setArg0(args[0]);
    var xml;
    xml = cxfjsutils.beginSoap11Message("xmlns:jns0='http://Partners.GLWebServ.com' ");
    // block for local variables
    {
     xml = xml + wrapperObj.serialize(cxfjsutils, 'jns0:getPicture', null);
    }
    xml = xml + cxfjsutils.endSoap11Message();
    return xml;
}

Partners_GLWebServ_com_PartnersWebServ.prototype.getPicture_serializeInput = Partners_GLWebServ_com_getPicture_serializeInput;

function Partners_GLWebServ_com_getPictureResponse_deserializeResponse(cxfjsutils, partElement) {
    var returnObject = Partners_GLWebServ_com_getPictureResponse_deserialize (cxfjsutils, partElement);

    return returnObject;
}
function Partners_GLWebServ_com_PartnersWebServ_Partners_GLWebServ_com_PartnersWebServPort () {
  this.url = 'http://localhost:8090/partners';
}
Partners_GLWebServ_com_PartnersWebServ_Partners_GLWebServ_com_PartnersWebServPort.prototype = new Partners_GLWebServ_com_PartnersWebServ;
