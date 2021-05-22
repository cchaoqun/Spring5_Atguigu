package com.AtGuiGu.Spring8_AOP_AspectJ.Annotation;

import org.springframework.stereotype.Component;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-18:37
 */

//被增强的类
@Component
public class User {
    //被增强的方法
    public void add(){
//        int i = 10/0;
        System.out.println("add...");
    }
}
