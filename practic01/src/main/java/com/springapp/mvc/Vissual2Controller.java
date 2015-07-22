package com.springapp.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Vissual2Controller {

    @RequestMapping("/vissual.htm")
    public ModelAndView handlerequest (HttpServletRequest hsr, HttpServletResponse hsr1){


        ModelAndView mv = new ModelAndView("vissual");

        return mv;
    }
}
