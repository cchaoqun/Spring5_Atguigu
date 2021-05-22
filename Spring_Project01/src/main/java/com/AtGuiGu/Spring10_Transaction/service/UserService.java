package com.AtGuiGu.Spring10_Transaction.service;

import com.AtGuiGu.Spring10_Transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/6-9:25
 */

@Service
//              是否只读                超时时间    传播行为                           隔离级别
@Transactional(readOnly=false, timeout=-1, propagation= Propagation.REQUIRED, isolation= Isolation.REPEATABLE_READ)
public class UserService {
    //注入Dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void transfer(){
        //编程式事务管理
//        try{
//            //第一步  开启事务
//
//            //第二步 进行业务操作
//            //lucy 少 100
//            userDao.reduceMoney();
//
//            //模拟异常
//            int i = 10 / 0;
//
//            //mary 多 100
//            userDao.addMoney();
//
//            //第三步 没有发生异常, 提交事务
//        }catch(Exception e){
//            //第四步  出现异常, 事务回滚
//        }

        //声明式事务管理
        //lucy 少 100
        userDao.reduceMoney();

        //模拟异常
        int i = 10 / 0;

        //mary 多 100
        userDao.addMoney();

    }
}
