package com.wsp.springboot.jdbc.impl;

import com.wsp.springboot.api.dao.IUserDao;
import com.wsp.springboot.api.service.IUserService;
import com.wsp.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IUserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;
    @Override
    public int insetUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int delUser(String id) {
        return userDao.delUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }


}
