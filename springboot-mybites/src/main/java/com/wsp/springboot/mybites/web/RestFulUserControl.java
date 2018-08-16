package com.wsp.springboot.mybites.web;

import com.wsp.springboot.mybites.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFulUserControl {
    @Autowired
    private IUserService userService;
    public  String updateUser(){
        int rowNum = userService.update("wsp", "1001");
        return  rowNum ==1? "成功" : "失败";
    }

}
