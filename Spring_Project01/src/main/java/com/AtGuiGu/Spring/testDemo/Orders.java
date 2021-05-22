package com.AtGuiGu.Spring.testDemo;

/**
 * 演示有参构造进行属性注入
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-16:27
 */

public class Orders {

    private String oname;
    private String address;

    //有参构造进行属性注入
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void testConsDI(){
        System.out.println(oname+"::"+address);
    }

//    public Orders() {
//    }
}
