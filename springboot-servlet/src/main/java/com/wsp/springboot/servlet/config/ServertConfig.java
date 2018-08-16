package com.wsp.springboot.servlet.config;

import com.wsp.springboot.servlet.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.stereotype.Component;

@Component
public class ServertConfig {
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new MyServlet(),"/myServlet/*") ;
    }
}
