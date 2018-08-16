package com.wsp.springboot.api.dao;


import com.wsp.springboot.bean.User;

import java.util.List;

public interface IUserDao {
    //添加一条记录
     int insertUser(User user);
     //根据id删除用户
    int delUser(String id);
    //根据指定的用户信息修改用户信息
    int updateUser(User user);
    //查询用户列表
    List<User> getUserList();
}
