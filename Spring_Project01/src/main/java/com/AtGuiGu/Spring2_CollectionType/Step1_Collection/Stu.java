package com.AtGuiGu.Spring2_CollectionType.Step1_Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-19:50
 */

public class Stu {

    //数组
    private String[] courses;

    //List集合
    private List<String> list;

    //map
    private Map<String, String> map;

    //set
    private Set<String> set;

    //List包含对象类型
    private List<Course> courseList;


    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void show(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(courseList);
    }
}
