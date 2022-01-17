package cc.spring.service.impl;

import cc.spring.bean.SysUser;
import cc.spring.dao.UserDao;
import cc.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
    }

    @Override
    public void insertUser(SysUser user) {
        userDao.insertUser(user);
    }


}
