package cc.dao.impl;

import cc.dao.UserDao;
import cc.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private String username;
    private String password;
    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public UserDaoImpl(){
        System.out.println("UserDaoImpl无参构造创建。。。");
    }
    public void save() {
        System.out.println(username+"======="+password);
        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running!");
    }
}
