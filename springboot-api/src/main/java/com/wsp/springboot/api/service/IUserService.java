package com.wsp.springboot.api.service;

import com.wsp.springboot.bean.User;

import java.util.List;

public interface IUserService {
    int insetUser(User user);
    int delUser(String id);
    int updateUser(User user);
    List<User> getUserList();
}
