package com.AtGuiGu.Spring4_LifeSpan.bean;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-16:59
 */

public class Order {
    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("Step2: 执行属性对应的set设置属性的值");
    }

    public Order() {
        System.out.println("Step1: 执行无参构造创建bean实例");
    }

    public Order(String oname) {
        this.oname = oname;
    }

    //创建执行的初始化方法
    public void initMethod(){
        System.out.println("Step3: 执行的初始化方法");
    }

    //创建执行的销毁方法
    public void destroyMethod(){
        System.out.println("Step5: 执行销毁的方法");
    }
}
