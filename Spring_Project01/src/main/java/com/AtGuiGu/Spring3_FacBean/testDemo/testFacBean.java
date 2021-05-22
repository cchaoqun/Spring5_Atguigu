package com.AtGuiGu.Spring3_FacBean.testDemo;

import com.AtGuiGu.Spring2_CollectionType.Step1_Collection.Course;
import com.AtGuiGu.Spring2_CollectionType.Step1_Collection.Extract;
import com.AtGuiGu.Spring3_FacBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-16:15
 */

public class testFacBean {

    /**
     * 测试FactoryBean 定义类与返回类不同
     */
    @Test
    public void testNormalBean(){
        //普通bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7FacBean.xml");
        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
    }

    /**
     * 测试bean实例默认是单例, 可以修改为多例
     * 默认为 scope=singleton 单例
     * 修改为 scope=prototype 多例
     */
    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6Extraction.xml");
        Extract extract1 =  context.getBean("extract", Extract.class);
        Extract extract2 =  context.getBean("extract", Extract.class);
        System.out.println(extract1);
        System.out.println(extract2);
    }
}
