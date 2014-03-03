//
// Definitions for schema: http://webservice/
//  http://localhost:8090/area?xsd=1
//
//
// Constructor for XML Schema item {http://webservice/}rectangleResponse
//
function webservice__rectangleResponse () {
    this.typeMarker = 'webservice__rectangleResponse';
    this._return = 0.0;
}

//
// accessor is webservice__rectangleResponse.prototype.getReturn
// element get for return
// - element type is {http://www.w3.org/2001/XMLSchema}double
// - required element
//
// element set for return
// setter function is is webservice__rectangleResponse.prototype.setReturn
//
function webservice__rectangleResponse_getReturn() { return this._return;}

webservice__rectangleResponse.prototype.getReturn = webservice__rectangleResponse_getReturn;

function webservice__rectangleResponse_setReturn(value) { this._return = value;}

webservice__rectangleResponse.prototype.setReturn = webservice__rectangleResponse_setReturn;
//
// Serialize {http://webservice/}rectangleResponse
//
function webservice__rectangleResponse_serialize(cxfjsutils, elementName, extraNamespaces) {
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
     xml = xml + '<return>';
     xml = xml + cxfjsutils.escapeXmlEntities(this._return);
     xml = xml + '</return>';
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

webservice__rectangleResponse.prototype.serialize = webservice__rectangleResponse_serialize;

function webservice__rectangleResponse_deserialize (cxfjsutils, element) {
    var newobject = new webservice__rectangleResponse();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing return');
    var value = null;
    if (!cxfjsutils.isElementNil(curElement)) {
     value = cxfjsutils.getNodeText(curElement);
     item = parseFloat(value);
    }
    newobject.setReturn(item);
    var item = null;
    if (curElement != null) {
     curElement = cxfjsutils.getNextElementSibling(curElement);
    }
    return newobject;
}

//
// Constructor for XML Schema item {http://webservice/}rectangle
//
function webservice__rectangle () {
    this.typeMarker = 'webservice__rectangle';
    this._length = 0.0;
    this._breadth = 0.0;
}

//
// accessor is webservice__rectangle.prototype.getLength
// element get for length
// - element type is {http://www.w3.org/2001/XMLSchema}double
// - required element
//
// element set for length
// setter function is is webservice__rectangle.prototype.setLength
//
function webservice__rectangle_getLength() { return this._length;}

webservice__rectangle.prototype.getLength = webservice__rectangle_getLength;

function webservice__rectangle_setLength(value) { this._length = value;}

webservice__rectangle.prototype.setLength = webservice__rectangle_setLength;
//
// accessor is webservice__rectangle.prototype.getBreadth
// element get for breadth
// - element type is {http://www.w3.org/2001/XMLSchema}double
// - required element
//
// element set for breadth
// setter function is is webservice__rectangle.prototype.setBreadth
//
function webservice__rectangle_getBreadth() { return this._breadth;}

webservice__rectangle.prototype.getBreadth = webservice__rectangle_getBreadth;

function webservice__rectangle_setBreadth(value) { this._breadth = value;}

webservice__rectangle.prototype.setBreadth = webservice__rectangle_setBreadth;
//
// Serialize {http://webservice/}rectangle
//
function webservice__rectangle_serialize(cxfjsutils, elementName, extraNamespaces) {
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
     xml = xml + '<length>';
     xml = xml + cxfjsutils.escapeXmlEntities(this._length);
     xml = xml + '</length>';
    }
    // block for local variables
    {
     xml = xml + '<breadth>';
     xml = xml + cxfjsutils.escapeXmlEntities(this._breadth);
     xml = xml + '</breadth>';
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

webservice__rectangle.prototype.serialize = webservice__rectangle_serialize;

function webservice__rectangle_deserialize (cxfjsutils, element) {
    var newobject = new webservice__rectangle();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing length');
    var value = null;
    if (!cxfjsutils.isElementNil(curElement)) {
     value = cxfjsutils.getNodeText(curElement);
     item = parseFloat(value);
    }
    newobject.setLength(item);
    var item = null;
    if (curElement != null) {
     curElement = cxfjsutils.getNextElementSibling(curElement);
    }
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing breadth');
    var value = null;
    if (!cxfjsutils.isElementNil(curElement)) {
     value = cxfjsutils.getNodeText(curElement);
     item = parseFloat(value);
    }
    newobject.setBreadth(item);
    var item = null;
    if (curElement != null) {
     curElement = cxfjsutils.getNextElementSibling(curElement);
    }
    return newobject;
}

//
// Constructor for XML Schema item {http://webservice/}squareResponse
//
function webservice__squareResponse () {
    this.typeMarker = 'webservice__squareResponse';
    this._return = null;
}

//
// accessor is webservice__squareResponse.prototype.getReturn
// element get for return
// - element type is {http://www.w3.org/2001/XMLSchema}string
// - optional element
//
// element set for return
// setter function is is webservice__squareResponse.prototype.setReturn
//
function webservice__squareResponse_getReturn() { return this._return;}

webservice__squareResponse.prototype.getReturn = webservice__squareResponse_getReturn;

function webservice__squareResponse_setReturn(value) { this._return = value;}

webservice__squareResponse.prototype.setReturn = webservice__squareResponse_setReturn;
//
// Serialize {http://webservice/}squareResponse
//
function webservice__squareResponse_serialize(cxfjsutils, elementName, extraNamespaces) {
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

webservice__squareResponse.prototype.serialize = webservice__squareResponse_serialize;

function webservice__squareResponse_deserialize (cxfjsutils, element) {
    var newobject = new webservice__squareResponse();
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
// Constructor for XML Schema item {http://webservice/}square
//
function webservice__square () {
    this.typeMarker = 'webservice__square';
    this._side = 0.0;
}

//
// accessor is webservice__square.prototype.getSide
// element get for side
// - element type is {http://www.w3.org/2001/XMLSchema}double
// - required element
//
// element set for side
// setter function is is webservice__square.prototype.setSide
//
function webservice__square_getSide() { return this._side;}

webservice__square.prototype.getSide = webservice__square_getSide;

function webservice__square_setSide(value) { this._side = value;}

webservice__square.prototype.setSide = webservice__square_setSide;
//
// Serialize {http://webservice/}square
//
function webservice__square_serialize(cxfjsutils, elementName, extraNamespaces) {
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
     xml = xml + '<side>';
     xml = xml + cxfjsutils.escapeXmlEntities(this._side);
     xml = xml + '</side>';
    }
    if (elementName != null) {
     xml = xml + '</';
     xml = xml + elementName;
     xml = xml + '>';
    }
    return xml;
}

webservice__square.prototype.serialize = webservice__square_serialize;

function webservice__square_deserialize (cxfjsutils, element) {
    var newobject = new webservice__square();
    cxfjsutils.trace('element: ' + cxfjsutils.traceElementName(element));
    var curElement = cxfjsutils.getFirstElementChild(element);
    var item;
    cxfjsutils.trace('curElement: ' + cxfjsutils.traceElementName(curElement));
    cxfjsutils.trace('processing side');
    var value = null;
    if (!cxfjsutils.isElementNil(curElement)) {
     value = cxfjsutils.getNodeText(curElement);
     item = parseFloat(value);
    }
    newobject.setSide(item);
    var item = null;
    if (curElement != null) {
     curElement = cxfjsutils.getNextElementSibling(curElement);
    }
    return newobject;
}

//
// Definitions for schema: null
//  http://localhost:8090/area?wsdl#types1
//
//
// Definitions for service: {http://webservice/}AreaService
//

// Javascript for {http://webservice/}Area

function webservice__Area () {
    this.jsutils = new CxfApacheOrgUtil();
    this.jsutils.interfaceObject = this;
    this.synchronous = false;
    this.url = null;
    this.client = null;
    this.response = null;
    this.globalElementSerializers = [];
    this.globalElementDeserializers = [];
    this.globalElementSerializers['{http://webservice/}rectangleResponse'] = webservice__rectangleResponse_serialize;
    this.globalElementDeserializers['{http://webservice/}rectangleResponse'] = webservice__rectangleResponse_deserialize;
    this.globalElementSerializers['{http://webservice/}squareResponse'] = webservice__squareResponse_serialize;
    this.globalElementDeserializers['{http://webservice/}squareResponse'] = webservice__squareResponse_deserialize;
    this.globalElementSerializers['{http://webservice/}rectangle'] = webservice__rectangle_serialize;
    this.globalElementDeserializers['{http://webservice/}rectangle'] = webservice__rectangle_deserialize;
    this.globalElementSerializers['{http://webservice/}square'] = webservice__square_serialize;
    this.globalElementDeserializers['{http://webservice/}square'] = webservice__square_deserialize;
    this.globalElementSerializers['{http://webservice/}rectangleResponse'] = webservice__rectangleResponse_serialize;
    this.globalElementDeserializers['{http://webservice/}rectangleResponse'] = webservice__rectangleResponse_deserialize;
    this.globalElementSerializers['{http://webservice/}rectangle'] = webservice__rectangle_serialize;
    this.globalElementDeserializers['{http://webservice/}rectangle'] = webservice__rectangle_deserialize;
    this.globalElementSerializers['{http://webservice/}squareResponse'] = webservice__squareResponse_serialize;
    this.globalElementDeserializers['{http://webservice/}squareResponse'] = webservice__squareResponse_deserialize;
    this.globalElementSerializers['{http://webservice/}square'] = webservice__square_serialize;
    this.globalElementDeserializers['{http://webservice/}square'] = webservice__square_deserialize;
}

function webservice__rectangle_op_onsuccess(client, responseXml) {
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
     this.jsutils.trace('calling webservice__rectangleResponse_deserializeResponse');
     responseObject = webservice__rectangleResponse_deserializeResponse(this.jsutils, element);
     client.user_onsuccess(responseObject);
    }
}

webservice__Area.prototype.rectangle_onsuccess = webservice__rectangle_op_onsuccess;

function webservice__rectangle_op_onerror(client) {
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

webservice__Area.prototype.rectangle_onerror = webservice__rectangle_op_onerror;

//
// Operation {http://webservice/}rectangle
// Wrapped operation.
// parameter length
// - simple type {http://www.w3.org/2001/XMLSchema}double// parameter breadth
// - simple type {http://www.w3.org/2001/XMLSchema}double//
function webservice__rectangle_op(successCallback, errorCallback, length, breadth) {
    this.client = new CxfApacheOrgClient(this.jsutils);
    var xml = null;
    var args = new Array(2);
    args[0] = length;
    args[1] = breadth;
    xml = this.rectangle_serializeInput(this.jsutils, args);
    this.client.user_onsuccess = successCallback;
    this.client.user_onerror = errorCallback;
    var closureThis = this;
    this.client.onsuccess = function(client, responseXml) { closureThis.rectangle_onsuccess(client, responseXml); };
    this.client.onerror = function(client) { closureThis.rectangle_onerror(client); };
    var requestHeaders = [];
    requestHeaders['SOAPAction'] = '';
    this.jsutils.trace('synchronous = ' + this.synchronous);
    this.client.request(this.url, xml, null, this.synchronous, requestHeaders);
}

webservice__Area.prototype.rectangle = webservice__rectangle_op;

function webservice__rectangle_serializeInput(cxfjsutils, args) {
    var wrapperObj = new webservice__rectangle();
    wrapperObj.setLength(args[0]);
    wrapperObj.setBreadth(args[1]);
    var xml;
    xml = cxfjsutils.beginSoap11Message("xmlns:jns0='http://webservice/' ");
    // block for local variables
    {
     xml = xml + wrapperObj.serialize(cxfjsutils, 'jns0:rectangle', null);
    }
    xml = xml + cxfjsutils.endSoap11Message();
    return xml;
}

webservice__Area.prototype.rectangle_serializeInput = webservice__rectangle_serializeInput;

function webservice__rectangleResponse_deserializeResponse(cxfjsutils, partElement) {
    var returnObject = webservice__rectangleResponse_deserialize (cxfjsutils, partElement);

    return returnObject;
}
function webservice__square_op_onsuccess(client, responseXml) {
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
     this.jsutils.trace('calling webservice__squareResponse_deserializeResponse');
     responseObject = webservice__squareResponse_deserializeResponse(this.jsutils, element);
     client.user_onsuccess(responseObject);
    }
}

webservice__Area.prototype.square_onsuccess = webservice__square_op_onsuccess;

function webservice__square_op_onerror(client) {
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

webservice__Area.prototype.square_onerror = webservice__square_op_onerror;

//
// Operation {http://webservice/}square
// Wrapped operation.
// parameter side
// - simple type {http://www.w3.org/2001/XMLSchema}double//
function webservice__square_op(successCallback, errorCallback, side) {
    this.client = new CxfApacheOrgClient(this.jsutils);
    var xml = null;
    var args = new Array(1);
    args[0] = side;
    xml = this.square_serializeInput(this.jsutils, args);
    this.client.user_onsuccess = successCallback;
    this.client.user_onerror = errorCallback;
    var closureThis = this;
    this.client.onsuccess = function(client, responseXml) { closureThis.square_onsuccess(client, responseXml); };
    this.client.onerror = function(client) { closureThis.square_onerror(client); };
    var requestHeaders = [];
    requestHeaders['SOAPAction'] = '';
    this.jsutils.trace('synchronous = ' + this.synchronous);
    this.client.request(this.url, xml, null, this.synchronous, requestHeaders);
}

webservice__Area.prototype.square = webservice__square_op;

function webservice__square_serializeInput(cxfjsutils, args) {
    var wrapperObj = new webservice__square();
    wrapperObj.setSide(args[0]);
    var xml;
    xml = cxfjsutils.beginSoap11Message("xmlns:jns0='http://webservice/' ");
    // block for local variables
    {
     xml = xml + wrapperObj.serialize(cxfjsutils, 'jns0:square', null);
    }
    xml = xml + cxfjsutils.endSoap11Message();
    return xml;
}

webservice__Area.prototype.square_serializeInput = webservice__square_serializeInput;

function webservice__squareResponse_deserializeResponse(cxfjsutils, partElement) {
    var returnObject = webservice__squareResponse_deserialize (cxfjsutils, partElement);

    return returnObject;
}
function webservice__Area_webservice__AreaPort () {
  this.url = 'http://localhost:8090/area';
}
webservice__Area_webservice__AreaPort.prototype = new webservice__Area;
