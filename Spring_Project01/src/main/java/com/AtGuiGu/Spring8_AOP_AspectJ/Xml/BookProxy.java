package com.AtGuiGu.Spring8_AOP_AspectJ.Xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-19:39
 */

public class BookProxy {

    //前置通知
    public void before(){
        System.out.println("before...");
    }

    //最终通知
    public void after(){
        System.out.println("after...");
    }

    //后置通知
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    //异常通知
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    //环绕通知
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...");

    }
}
