package com.springapp.mvc;

import com.springapp.model.Coche;
import com.springapp.service.CocheService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpHandler;
import java.util.logging.Handler;



@Controller
@RequestMapping("/vista-coche.htm")
public class CocheController {



    @RequestMapping
    public ModelAndView Request(HttpServletRequest hsr, HttpServletResponse hsr1){
    ModelAndView mv = new ModelAndView("vista-coche");
        Coche coche = new CocheService().CreaCoche();

        //LLAMAR A UN COCHE

        System.out.println(coche.toString());
        System.out.println("sdfmsdfkls");

    mv.addObject("coche",coche);
    return mv;
    }
}

