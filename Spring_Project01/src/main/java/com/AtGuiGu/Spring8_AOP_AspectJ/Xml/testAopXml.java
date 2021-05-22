package com.AtGuiGu.Spring8_AOP_AspectJ.Xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-19:54
 */

public class testAopXml {

    @Test
    public void testAopXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean13_AOP_AspectJ_xml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();

    }
}
