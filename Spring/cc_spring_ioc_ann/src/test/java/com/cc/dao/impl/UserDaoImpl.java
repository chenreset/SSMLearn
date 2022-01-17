package com.cc.dao.impl;


import com.cc.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("UserDao save() running!!");
    }
}
