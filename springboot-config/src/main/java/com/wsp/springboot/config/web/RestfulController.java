package com.wsp.springboot.config.web;

import com.wsp.springboot.config.bean.ConfigBean;
import com.wsp.springboot.config.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restful/")
@EnableConfigurationProperties({ConfigBean.class,User.class})
public class RestfulController {
    @Autowired
    ConfigBean configBean;


    @RequestMapping(value = "/v1.0/configBean",method = RequestMethod.GET)
    private String BeanValue(){
        return configBean.getName()+"======="+configBean.getName();
    }
    @Autowired
    User user;
    @RequestMapping(value = "/v1.0/getUserList",method = RequestMethod.GET)
    private String GetUserList(){
        return user.getName()+"========"+user.getAge();
    }
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping(value = "/v1.0/my",method = RequestMethod.GET)
    public String dataValue(){
        return name+":"+age;
    }
}
