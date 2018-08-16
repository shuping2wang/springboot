package com.wsp.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

    @RequestMapping("/")
    public ModelAndView  index(ModelAndView map){
        map.addObject("host", "http://blog.didispace.com");
        map.setViewName("/index");
        return map;
    }
}
