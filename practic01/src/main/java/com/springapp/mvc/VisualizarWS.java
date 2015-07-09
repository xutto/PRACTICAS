package com.springapp.mvc;
//--------------------------------------------------------------------------------------------

import com.springapp.service.WebClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class VisualizarWS {


    @RequestMapping("/webservice.htm")
    public ModelAndView HandleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) {
        ModelAndView mv = new ModelAndView("visualizarWS");

        WebClientService webClientService = new WebClientService();
      //  String datows = webClientService.call("polloman","martinez");

       // System.out.println(datows);
        mv.addObject("datows", "datows");
        return mv;
    }
}
