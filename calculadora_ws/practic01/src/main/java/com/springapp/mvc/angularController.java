package com.springapp.mvc;


import com.google.gson.Gson;
import com.springapp.model.Coche;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Controller
@RequestMapping("/angular.htm")
public class angularController {


    @RequestMapping
    public ModelAndView Request(HttpServletRequest hsr, HttpServletResponse hsr1) {
        ModelAndView mv = new ModelAndView("angular");
        ArrayList<Coche> coches = new ArrayList<Coche>();
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        coche1.setMarca("Mercedes");
        coche1.setModelo("CLS");
        coche1.setColor("blanco");

        coche2.setMarca("Renault");
        coche2.setModelo("Clio");
        coche2.setColor("Amarillo");

        coches.add(coche1);
        coches.add(coche2);

        Gson gson = new Gson();
        String jCoches = gson.toJson(coches);
        System.out.println(jCoches);


        String titulo = "default";
        String tri = "";
        String hola = "hole";
        Boolean show = true;
        if (hsr.getParameter("aparece") != null) {
            tri = hsr.getParameter("aparece");

            if (tri.equals("true")) {
                show = true;
            }
            if (tri.equals("false")) {
                show = false;
            }
        }

        if (hsr.getParameter("titulon") != null) {
            if (hsr.getParameter("titulon").equals("")) {
                titulo = "default";
            } else {
                titulo = hsr.getParameter("titulon");
            }
        }


        mv.addObject("titulo", titulo);
        mv.addObject("coches",jCoches);
        mv.addObject("hola", hola);
        mv.addObject("show", show);
        return mv;

    }

}
