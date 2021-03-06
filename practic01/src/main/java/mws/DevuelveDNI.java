
package mws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DevuelveDNI", targetNamespace = "http://ws.app.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DevuelveDNI {


    /**
     * 
     * @param apellido
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operation1", targetNamespace = "http://ws.app.com/", className = "mws.Operation1")
    @ResponseWrapper(localName = "operation1Response", targetNamespace = "http://ws.app.com/", className = "mws.Operation1Response")
    @Action(input = "http://ws.app.com/DevuelveDNI/operation1Request", output = "http://ws.app.com/DevuelveDNI/operation1Response")
    public String operation1(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido);



}
