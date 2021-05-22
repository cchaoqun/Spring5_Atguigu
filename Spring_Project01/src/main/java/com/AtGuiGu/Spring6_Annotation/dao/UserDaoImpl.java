package com.AtGuiGu.Spring6_Annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-19:40
 */
@Repository(value="userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("userDaoImpl1 dao add1...");
    }
}
