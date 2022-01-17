package cc.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class SysUser {
    @Value("${myname}")
    private String name;
    @Value("${myage}")
    private String age;


    public SysUser() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
