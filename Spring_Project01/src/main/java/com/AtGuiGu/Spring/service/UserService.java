package com.AtGuiGu.Spring.service;

import com.AtGuiGu.Spring.dao.UserDao;
import com.AtGuiGu.Spring.dao.UserDaoImpl;

/**
 * 希望实现在UserService类中完成UserDao类的调用
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-17:07
 */

public class UserService {

    //创建UserDao类型属性,生成set方法
    private UserDao userDao;

    public void add(){
        System.out.println("UserService add...");

        userDao.update();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
