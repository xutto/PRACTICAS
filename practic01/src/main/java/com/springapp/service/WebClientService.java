package com.springapp.service;


import mws.DevuelveDNI;
import mws.DevuelveDNI_Service;
import org.springframework.context.support.ResourceBundleMessageSource;
import ws.meteor.Efemerides;
import ws.meteor.Fecha;
import ws.meteor.WSMeteorologico;
import ws.meteor.WSMeteorologicoSoap;

import javax.inject.Inject;


public class WebClientService {


    public String FechaService() {

        WSMeteorologico service = new WSMeteorologico();
        WSMeteorologicoSoap port = service.getWSMeteorologicoSoap();

        return port.fecha();

    }


//
//    public String fecha() {
//        WSMeteorologico service = new WSMeteorologico();
//        WSMeteorologicoSoap port = service.getWSMeteorologicoSoap();
//
//        return port.fecha();
//    }



/*    private static String operation1(String nombre, String apellido){
        DevuelveDNI_Service service = new DevuelveDNI_Service();
        DevuelveDNI port = service.getDevuelveDNIPort();
        return port.operation1(nombre,apellido);
    }*/

//    public String call(String nombre, String apellido){
//
//
//        return eldato;
//    }

}
