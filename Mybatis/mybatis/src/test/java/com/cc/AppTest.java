package com.cc;

import static org.junit.Assert.assertTrue;

import com.cc.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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
    public void testSelectStudentById() throws Exception {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //namespace.id名
        String sqlId = "com.cc.dao.StudentDao"+"."+"selectStudentById";
        //查找一个学生记录selectOne
        Student student = sqlSession.selectOne(sqlId);
        System.out.println(student);
        sqlSession.close();
    }
    @Test
    public void testInsertStudent() throws Exception {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //namespace.id名
        String sqlId = "com.cc.dao.StudentDao"+"."+"insertStudent";
        //查找一个学生记录selectOne
        int r = sqlSession.insert(sqlId);
        System.out.println(r);
        sqlSession.commit();
        sqlSession.close();
    }
}
