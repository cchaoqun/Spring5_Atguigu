package com.AtGuiGu.Spring4_LifeSpan.bean;

import com.AtGuiGu.Spring2_CollectionType.Step1_Collection.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-17:04
 */

public class TestLifeSpan {

    @Test
    public void testNormalBean(){
        //普通bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8LifeSpan.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("Step4: 获取创建bean实例对象");
        System.out.println(order);

        //手动让bean实例销毁
        //因为接口中没有close方法
        //需要使用Application 实现类中的close方法
        //需要将context强转为ApplicationContext的实现类
        ((ClassPathXmlApplicationContext)context).close();
    }
}
