package com.AtGuiGu.Spring2_CollectionType.Step1_Collection;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-20:04
 */

public class Course {
    //课程名称
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
