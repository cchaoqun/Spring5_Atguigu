package com.AtGuiGu.Spring7_AOP_JDK_Proxy;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-17:17
 */

public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("接口实现类的add方法执行了...");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("接口实现类的update方法执行了...");
        return id;
    }
}
