package com.AtGuiGu.Spring8_AOP_AspectJ.Annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-18:39
 */

//增强的类
@Component //创建对象
@Aspect //表示生产代理对象
@Order(3)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value="execution(* com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User.add(..))")
    public void pointDemo(){

    }

    //前置通知
    //@Before 前置通知对应的注解
    //"execution(* com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User.add(..))" 中为切入点表达式
    @Before(value="pointDemo()")
    public void before(){
        System.out.println("before...");
    }

    //最终通知
    //被增强方法之后执行
    //有异常也执行
    @After(value="execution(* com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User.add(..))")
    public void after(){
        System.out.println("after...");
    }

    //后置通知
    //被增强方法返回值以后执行
    //有异常不执行
    @AfterReturning(value="execution(* com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User.add(..))")
    public void afterReturning(){
        System.out.println("after returning...");
    }

    //异常通知
    //被增强方法存在异常会执行
    @AfterThrowing(value="execution(* com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User.add(..))")
    public void afterThrowing(){
        System.out.println("after throwing...");
    }

    //环绕通知
    //在被增强方法之前之后都执行
    @Around(value="execution(* com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...");
    }

}
