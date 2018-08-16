package com.wsp.spring.jsp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

@Controller
public class ViewController {
    @RequestMapping(value = {"/","/index"})
    public String Index(HttpServletRequest request){
        request.setAttribute("content","this is index");
        request.setAttribute("time", Calendar.getInstance().getTime());
        return "index";
    }
}
