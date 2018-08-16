package com.wsp.springboot.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan({"com.wsp.springboot.listener.fitter","com.wsp.springboot.listener.listener"})
public class SpringbootListenerApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringbootListenerApplication.class,args);
    }
}
