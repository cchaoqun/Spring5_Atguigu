package com.AtGuiGu.Spring8_AOP_AspectJ.Annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-19:31
 */
//增强的类
@Component //创建对象
@Aspect //表示生产代理对象
@Order(1) //对同一个类的方法增强时的优先级, 越高先执行
public class PersonProxy {
    //前置通知
    //@Before 前置通知对应的注解
    //"execution(* com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User.add(..))" 中为切入点表达式
    @Before(value="execution(* com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User.add(..))")
    public void before(){
        System.out.println("Person before...");
    }
}
