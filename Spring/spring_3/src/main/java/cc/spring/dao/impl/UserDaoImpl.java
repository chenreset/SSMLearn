package cc.spring.dao.impl;

import cc.spring.bean.SysUser;
import cc.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("增加用户信息");
    }
}
