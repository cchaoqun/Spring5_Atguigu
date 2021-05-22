package com.AtGuiGu.Spring3_FacBean;

import com.AtGuiGu.Spring2_CollectionType.Step1_Collection.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-16:14
 */

public class MyBean implements FactoryBean<Course> {


    //定义返回bean类型,
    // 这里泛型为Course类, 所以返回Course类
    //实现了定义类型和返回类型不一致
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
