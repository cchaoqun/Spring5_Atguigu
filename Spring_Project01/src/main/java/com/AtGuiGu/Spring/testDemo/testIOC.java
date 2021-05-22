package com.AtGuiGu.Spring.testDemo;

import com.AtGuiGu.Spring.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-15:35
 */

public class testIOC {
    @Test
    public void test1(){
        UserService1 us = new UserService1();
        us.eat();
    }



}


class UserService1{

    public void eat(){
        System.out.println("User Service is eating...");
        User user = UserFactory.getUser();
        user.eat();
    }
}

class UserFactory{

    public static User getUser(){
        //加载配置文件
        //BeamFactory接口的子接口, 提供了更多更强大的功能, 一般由开发人员使用
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //Spring 内部的使用接口, 不提供给开发人员使用
        BeanFactory context2 = new ClassPathXmlApplicationContext("bean1.xml");


        User user = (User) context2.getBean("user");
        return user;
    }
}
