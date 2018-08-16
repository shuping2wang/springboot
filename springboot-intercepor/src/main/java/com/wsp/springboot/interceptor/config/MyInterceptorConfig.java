package com.wsp.springboot.interceptor.config;

import com.wsp.springboot.interceptor.interceptor.MyInterceptor1;
import com.wsp.springboot.interceptor.interceptor.MyInterceptor2;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class MyInterceptorConfig extends WebMvcConfigurerAdapter {
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
