package com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.test;

import com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User;
import com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-18:54
 */

public class testAspectJAop {
    // xml注解配置
    @Test
    public void testAopAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12_AOP_AspectJ_Annotation.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    //完全注解 注解类
    @Test
    public void testAopAutoAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
