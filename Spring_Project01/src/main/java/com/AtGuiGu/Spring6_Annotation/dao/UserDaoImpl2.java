package com.AtGuiGu.Spring6_Annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-20:03
 */
@Repository(value="userDaoImpl2")
public class UserDaoImpl2 implements UserDao{
    @Override
    public void add() {
        System.out.println("userDaoImpl2 dao add2...");
    }
}
