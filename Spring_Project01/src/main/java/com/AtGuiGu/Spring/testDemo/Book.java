package com.AtGuiGu.Spring.testDemo;

/**
 * 演示使用set方法进行注入属性
 *
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-16:12
 */

public class Book {

    //创建属性
    private String bname;
    private String bauthor;
    private String address;

    //创建属性对应的set方法

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDI(){
        System.out.println(bname+"::"+bauthor+"::"+address);
    }

    public String getAddress() {
        return address;
    }

    public String getBname() {
        return bname;
    }

    public String getBauthor() {
        return bauthor;
    }


    //有参构造注入
    public Book(String bname) {
        this.bname = bname;
    }

    public Book() {
    }
}
