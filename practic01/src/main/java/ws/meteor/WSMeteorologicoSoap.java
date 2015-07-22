
package ws.meteor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSMeteorologicoSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSMeteorologicoSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PronosticoRegional", action = "http://tempuri.org/PronosticoRegional")
    @WebResult(name = "PronosticoRegionalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "PronosticoRegional", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoRegional")
    @ResponseWrapper(localName = "PronosticoRegionalResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoRegionalResponse")
    public String pronosticoRegional();

    /**
     * 
     * @param regionID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PronosticoRegionalxID", action = "http://tempuri.org/PronosticoRegionalxID")
    @WebResult(name = "PronosticoRegionalxIDResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "PronosticoRegionalxID", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoRegionalxID")
    @ResponseWrapper(localName = "PronosticoRegionalxIDResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoRegionalxIDResponse")
    public String pronosticoRegionalxID(
        @WebParam(name = "regionID", targetNamespace = "http://tempuri.org/")
        int regionID);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PronosticoPorCiudad", action = "http://tempuri.org/PronosticoPorCiudad")
    @WebResult(name = "PronosticoPorCiudadResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "PronosticoPorCiudad", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoPorCiudad")
    @ResponseWrapper(localName = "PronosticoPorCiudadResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoPorCiudadResponse")
    public String pronosticoPorCiudad();

    /**
     * 
     * @param ciudadID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PronosticoPorCiudadxID", action = "http://tempuri.org/PronosticoPorCiudadxID")
    @WebResult(name = "PronosticoPorCiudadxIDResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "PronosticoPorCiudadxID", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoPorCiudadxID")
    @ResponseWrapper(localName = "PronosticoPorCiudadxIDResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoPorCiudadxIDResponse")
    public String pronosticoPorCiudadxID(
        @WebParam(name = "ciudadID", targetNamespace = "http://tempuri.org/")
        int ciudadID);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Efemerides", action = "http://tempuri.org/Efemerides")
    @WebResult(name = "EfemeridesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Efemerides", targetNamespace = "http://tempuri.org/", className = "ws.meteor.Efemerides")
    @ResponseWrapper(localName = "EfemeridesResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.EfemeridesResponse")
    public String efemerides();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Fecha", action = "http://tempuri.org/Fecha")
    @WebResult(name = "FechaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Fecha", targetNamespace = "http://tempuri.org/", className = "ws.meteor.Fecha")
    @ResponseWrapper(localName = "FechaResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.FechaResponse")
    public String fecha();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Hora", action = "http://tempuri.org/Hora")
    @WebResult(name = "HoraResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Hora", targetNamespace = "http://tempuri.org/", className = "ws.meteor.Hora")
    @ResponseWrapper(localName = "HoraResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.HoraResponse")
    public String hora();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "EstadoActualRegional", action = "http://tempuri.org/EstadoActualRegional")
    @WebResult(name = "EstadoActualRegionalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EstadoActualRegional", targetNamespace = "http://tempuri.org/", className = "ws.meteor.EstadoActualRegional")
    @ResponseWrapper(localName = "EstadoActualRegionalResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.EstadoActualRegionalResponse")
    public String estadoActualRegional();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "EstadoActualPorCiudad", action = "http://tempuri.org/EstadoActualPorCiudad")
    @WebResult(name = "EstadoActualPorCiudadResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EstadoActualPorCiudad", targetNamespace = "http://tempuri.org/", className = "ws.meteor.EstadoActualPorCiudad")
    @ResponseWrapper(localName = "EstadoActualPorCiudadResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.EstadoActualPorCiudadResponse")
    public String estadoActualPorCiudad();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/pronosticoExtendidoRegion")
    @WebResult(name = "pronosticoExtendidoRegionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "pronosticoExtendidoRegion", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoExtendidoRegion")
    @ResponseWrapper(localName = "pronosticoExtendidoRegionResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoExtendidoRegionResponse")
    public String pronosticoExtendidoRegion();

    /**
     * 
     * @param regionID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/pronosticoExtendidoRegionxID")
    @WebResult(name = "pronosticoExtendidoRegionxIDResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "pronosticoExtendidoRegionxID", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoExtendidoRegionxID")
    @ResponseWrapper(localName = "pronosticoExtendidoRegionxIDResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoExtendidoRegionxIDResponse")
    public String pronosticoExtendidoRegionxID(
        @WebParam(name = "regionID", targetNamespace = "http://tempuri.org/")
        int regionID);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/pronosticoExtendidoCiudad")
    @WebResult(name = "pronosticoExtendidoCiudadResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "pronosticoExtendidoCiudad", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoExtendidoCiudad")
    @ResponseWrapper(localName = "pronosticoExtendidoCiudadResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoExtendidoCiudadResponse")
    public String pronosticoExtendidoCiudad();

    /**
     * 
     * @param ciudadID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/pronosticoExtendidoCiudadxID")
    @WebResult(name = "pronosticoExtendidoCiudadxIDResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "pronosticoExtendidoCiudadxID", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoExtendidoCiudadxID")
    @ResponseWrapper(localName = "pronosticoExtendidoCiudadxIDResponse", targetNamespace = "http://tempuri.org/", className = "ws.meteor.PronosticoExtendidoCiudadxIDResponse")
    public String pronosticoExtendidoCiudadxID(
        @WebParam(name = "ciudadID", targetNamespace = "http://tempuri.org/")
        int ciudadID);

}
