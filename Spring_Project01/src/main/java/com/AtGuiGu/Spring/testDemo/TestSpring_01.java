package com.AtGuiGu.Spring.testDemo;

import com.AtGuiGu.Spring.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC 操作 Bean管理
 * 1. 什么是Bean管理
 *      (0)Bean管理指的是两个操作
 *      (1)Spring 创建对象 实例化类的对象
 *      (2)Spring 注入属性, 类的属性赋值
 * 2.Bean管理操作有两种方式
 *      (1)基于xml配置文件方式实现
 *      (2)基于注解方式实现
 * 3.IOC 操作 Bean管理 基于xml方式
 *      3.1基于xml方式创建对象
 *      (1)在spring配置文件中,使用bean标签, 标签里添加对应属性,可以实现对象的创建
 *      (2)bean标签里很多属性
 *          id: 获取对象的唯一标识,通过这个标签可以获取对应的bean进而创建对象 (不能加特殊符号)
 *          class:  创建对象类的全路径(包类路径)
 *          name:   早期的属性,可以添加特殊符号
 *      (3)创建对象的时候,默认也是执行无参的构造方法,完成对象的创建,所以bean对应的类中必须有无参构造
 *
 *      3.2基于xml方式注入属性
 *      (1) DI: 依赖注入, 就是注入属性, IOC中的一种属性,需要在创建对象的基础上实现
 *              1).使用set方法注入
 *                  1.1 创建属性
 *                  1.2 spring配置文件配置对象的创建, 配置属性注入(bean标签内的property标签对属性进行赋值)  (创建set方法)
 *              2).使用有参构造注入
 *                  使用constructor-arg标签 以及利用 name value 赋值实现属性的注入
 *              3).简化的set方法 -->p名称空间注入
 *                  简化基于xml配置方法
 *                  3.1 在配置文件的beans标签内添加p名称空间注入
 *                      //赋值xmlns 加 ::p 类似于新变量p, 赋值原本连接, 最后的bean改成p
 *                      xmlns:p="http://www.springframework.org/schema/p"
 *                  3.2 只需在bean标签内部最后添加 p:类属性名="赋值" 即可完成属性注入
 *                  <bean id="book" class="com.AtGuiGu.Spring.testDemo.Book" p:bname="bookname2" p:bauthor="bookname2's_author">
 *                  </bean>
 *      3.3 xml注入其他类型属性
 *      (1)字面量
 *          1) null值
 *          <property name="address"><null/></property>
 *          2) 属性值包含特殊符号
 *         <!-- 属性值包含特殊符号
 *             1 把<>进行转义 &lt;代表左括号 &gt;代表右括号
 *             2 把待特殊符号内容写到CDATA 语法为 <value> <![CDATA[内容]]> </value> (创建快捷键为CD)
 *         -->
 *              <property name="address" value="&lt;&lt;南京&gt;&gt;"></property>
 *         <property name="address"><value><![CDATA[<<南京>>]]></value>
 *         </property>
 *       (2)注入属性
 *          1)外部bean
 *              1创建两个类service类和dao类
 *              2在service调用dao里面的方法
 *              3在spring配置文件中进行配置
 *          2)内部bean
 *
 *          3)级联赋值
 *
 *
 *
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-14:40
 */

public class TestSpring_01 {

    @Test
    public void testLoadClass(){
        /*1.加载spring配置文件 (配置文件需要放在resource目录中)
         */
        //BeamFactory接口的子接口, 提供了更多更强大的功能, 一般由开发人员使用
        //加载配置文件时,不会创建对象, 获取对象时才创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //Spring 内部的使用接口, 不提供给开发人员使用
        //加载配置文件时就会创建创建对象
        BeanFactory context2 = new ClassPathXmlApplicationContext("bean1.xml");


        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.eat();
    }

    /**
    bean标签内使用了property标签对属性进行了赋值
     */
    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
        book.testDI();
    }

    /**
     * bean标签内使用了constructor-arg标签, 对 name-value 对应属性赋值
     */
    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders order = (Orders) context.getBean("orders");
        System.out.println(order);
        order.testConsDI();
    }

    /**
     * <!--4 简化的set方法注入属性 -->
     *     <bean id="book" class="com.AtGuiGu.Spring.testDemo.Book" p:bname="bookname2" p:bauthor="bookname2's_author">
     *     </bean>
     */
    @Test
    public void testPDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
        book.testDI();
    }
}
