package cc.spring;

import static org.junit.Assert.assertTrue;

import cc.spring.ba01.Student;
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
    public void test1(){
        String path = "ba01/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        Student student = (Student) ctx.getBean("student");
        System.out.println("student=="+student);
    }
}
