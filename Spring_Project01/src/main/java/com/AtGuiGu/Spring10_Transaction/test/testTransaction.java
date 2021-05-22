package com.AtGuiGu.Spring10_Transaction.test;

import com.AtGuiGu.Spring10_Transaction.config.TransactionConfig;
import com.AtGuiGu.Spring10_Transaction.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/6-9:34
 */

public class testTransaction {

    @Nullable
    private String bookName;

    @Test
    public void testTransfer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean15_Transaction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

    @Test
    public void testTransferXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean16_Transaction_Xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

    @Test
    public void testTransferAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

    //函数式风格创建对象, 交给Spring管理
    @Test
    public void testGenericApplicationContext(){
        //1. 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2. 调用context的方法对象注册
        context.refresh();
        context.registerBean("user1",User.class, ()->new User());
        //3. 获取在spring注册的对象
//        User user = (User)context.getBean("com.AtGuiGu.Spring10_Transaction.test.User");
        User user1 = (User)context.getBean("user1");
        System.out.println(user1);
    }

}
