package com.AtGuiGu.Spring2_CollectionType.TestDemo;

import com.AtGuiGu.Spring2_CollectionType.Step1_Collection.Extract;
import com.AtGuiGu.Spring2_CollectionType.Step1_Collection.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-19:59
 */

public class TestCollection {

    @Test
    public void testCollection1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Stu stu = (Stu) context.getBean("stu", Stu.class);
        System.out.println(stu);
        stu.show();
    }

    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6Extraction.xml");
        Extract extract =  context.getBean("extract", Extract.class);
        extract.show();
    }
}
