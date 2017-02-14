package com.zhou.controller;

import com.zhou.entity.UserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ZhouXiang on 2017/2/10 16:50.
 */
public class UserTest {
   @Test
    public void test_h() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/ApplicationContext.xml");
        //读取sessionFactory这个bean ,强转成org.hibernate.SessionFactory
        SessionFactory factory = (SessionFactory) context.getBean("sessionFactory");
        System.out.println(factory);
        //定义与数据库打交道的会话对象
        Session session = factory.openSession();
        System.out.println(session.isConnected());
       Query q = session.createSQLQuery("select * from USER ").addEntity(UserEntity.class);

       List<UserEntity> list=q.list();
       for(UserEntity s:list){
           System.out.println(s);
       }
       session.close();

   }
}
