package com.wsp.springboot.jdbc.web;

import com.wsp.springboot.api.service.IUserService;
import com.wsp.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestfulController {

    @Autowired
    IUserService userService;

    @RequestMapping("/api/v1.0/inserUser")
    public String inserUser(){
        User user=new User();
        user.setId("111");
        user.setUserName("wangshuping");
        user.setPassword("123456");
        user.setAge(12);
        int i = userService.insetUser(user);
        return i > 0 ? "成功" :"失败";

    }

    @RequestMapping("api/v1.0/updateUser")
    public String updateUser(){
        User user=new User();
        user.setPassword("654321");
        user.setUserName("wangping");
        user.setId("111");
        int i = userService.updateUser(user);
        return i>0 ?"修改成功":"修改失败";
    }

    @RequestMapping("api/v1.0/delUser")
    public String delUser(){
        int i = userService.delUser("111");
        return i>0 ?"删除成功":"删除失败";

    }

    @RequestMapping("api/v1.0/getUserList")
    public List<User> getUserList(){
        List<User> userList = userService.getUserList();
        return userList;
    }

}
