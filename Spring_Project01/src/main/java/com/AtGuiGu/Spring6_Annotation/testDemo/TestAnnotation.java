package com.AtGuiGu.Spring6_Annotation.testDemo;

import com.AtGuiGu.Spring6_Annotation.config.SpringConfig;
import com.AtGuiGu.Spring6_Annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-18:50
 */

public class TestAnnotation {

    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean11Annotation.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    //完全注解开发 无需xml文件
    @Test
    public void testCompleteAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
