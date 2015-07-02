package com.springapp.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/angular.htm")
public class angularController {


    @RequestMapping
    public ModelAndView Request(HttpServletRequest hsr, HttpServletResponse hsr1){
        String tri = "";
        String hola = "hole";
        Boolean show = true;
        if (hsr.getParameter("aparece") != null){
            tri = hsr.getParameter("aparece");

            if (tri.equals("true")){
                show = true;
            }
            if (tri.equals("false")){
                show = false;
            }
        }

        ModelAndView mv = new ModelAndView("angular");




        mv.addObject("hola",hola);
        mv.addObject("show",show);
        return mv;

    }

}
