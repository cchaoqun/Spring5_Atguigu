package com.AtGuiGu.Spring5_AutoWire;

import com.AtGuiGu.Spring4_LifeSpan.bean.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-17:47
 */

public class testAutoWire {

    @Test
    public void testAutoWire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean9AutoWire.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
