package com.AtGuiGu.Spring6_Annotation.service;

import com.AtGuiGu.Spring6_Annotation.dao.UserDao;
import com.AtGuiGu.Spring6_Annotation.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-19:01
 */
//在注解里面value="属性值" 可以省略不写
//默认值是类名称, 首字母小写
//UserService --> userService
//@Component(value="userService") //<bean id="userService" class="...类的包路径">
//@Service()
//@Service
//@Controller
@Service
public class UserService {

    //1. 在UserService中定义注入的dao类属性
    //2. 不需要添加set方法
    //3. 在属性上面使用注解
//    @Autowired //根据类型进行注入
//    @Qualifier(value="userDaoImpl2")//根据名称进行注入
//    private UserDao userDao;

//    @Resource//根据类型进行注入
    @Resource(name="userDaoImpl2") //根据名称进行注入
    private UserDao userDao;

    @Value(value="abc")
    private String userName;


    public void add(){
        System.out.println("Service add..."+userName);
        userDao.add();
    }
}
