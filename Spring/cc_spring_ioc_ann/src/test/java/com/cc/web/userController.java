package com.cc.web;

import com.cc.config.SpringConfiguration;
import com.cc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class userController {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
