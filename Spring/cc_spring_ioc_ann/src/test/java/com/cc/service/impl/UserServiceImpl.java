package com.cc.service.impl;


import com.cc.dao.UserDao;
import com.cc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    public void save() {
        System.out.println(userDao);
        userDao.save();
    }
}
