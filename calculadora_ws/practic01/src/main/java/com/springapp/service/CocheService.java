package com.springapp.service;

import com.springapp.model.Coche;

import java.util.List;
import java.util.Map;

/**
 * Created by xutto on 27/06/2015.
 */
public class CocheService {



    public Coche CreaCoche(){
        Coche coche = CreateCocheDummy("bmv","320D","gris");
        return coche;
    }


    public Coche CreateCocheDummy(String marca, String modelo, String color){
        Coche coche = new Coche();

        coche.setMarca(marca);
        coche.setModelo(modelo);
        coche.setColor(color);


        return coche;
    }



}
