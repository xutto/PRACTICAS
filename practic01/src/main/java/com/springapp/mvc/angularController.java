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
        ModelAndView mv = new ModelAndView("angular");



        return mv;

    }

}
