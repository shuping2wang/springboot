package com.wsp.springboot.mybites.service.impl;

import com.wsp.springboot.mybites.mapper.TUserMapper;
import com.wsp.springboot.mybites.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService{
    @Autowired
    private TUserMapper userMapper;


    public int update(String  userName,String id) {
        return   userMapper.update("wsp","1l") ;

    }

}
