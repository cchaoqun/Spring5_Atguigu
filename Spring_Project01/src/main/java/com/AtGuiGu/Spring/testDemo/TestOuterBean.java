package com.AtGuiGu.Spring.testDemo;

import com.AtGuiGu.Spring.bean.Emp;
import com.AtGuiGu.Spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-17:20
 */

public class TestOuterBean {

    /**
     * 外部bean的注入
     */
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    /**
     * 内部bean的注入
     */
    @Test
    public void testBean3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.show();
    }

    /**
     * 级联赋值
     */
    @Test
    public void testBean4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.show();
    }


}
