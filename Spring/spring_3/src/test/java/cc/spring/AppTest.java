package cc.spring;

import static org.junit.Assert.assertTrue;

import cc.spring.bean.SysUser;
import cc.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test01(){
        String path = "ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        SysUser user = (SysUser) applicationContext.getBean("user");
        System.out.println(user);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.insertUser(user);
    }
}
