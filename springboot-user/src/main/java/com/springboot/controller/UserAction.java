package com.springboot.controller;

import com.springboot.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {
    @RequestMapping("/index")
    public String index() {
        User user = new User();
        user.setId("123");
        user.setUserName("aaa");
        user.setPassword("123456");
        return "/index";
    }

}
