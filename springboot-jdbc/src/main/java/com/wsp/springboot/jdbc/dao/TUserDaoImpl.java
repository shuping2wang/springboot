package com.wsp.springboot.jdbc.dao;

import com.wsp.springboot.api.dao.IUserDao;
import com.wsp.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TUserDaoImpl implements IUserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int insertUser(User user) {
        int rowNum=jdbcTemplate.update("INSERT INTO t_user(id,userName,password,age) VALUES (?,?,?,?)",user.getId(),user.getUserName(),user.getPassword(),user.getAge());
        return rowNum;
    }

    public  int delUser(String id){
       int rowNum= jdbcTemplate.update("delete from t_user WHERE  id= ?" ,id);
        return rowNum;
    }

    public int updateUser(User user){
       int rowNum= jdbcTemplate.update("UPDATE t_user set user_name=?,password=? where id=?",user.getUserName(),user.getPassword(),user.getId());
        return rowNum;
    }

    public List<User> getUserList(){
        List userList=jdbcTemplate.query("select * from t_user",new Object[]{}, new BeanPropertyRowMapper(User.class));
        return userList;
    }
}
