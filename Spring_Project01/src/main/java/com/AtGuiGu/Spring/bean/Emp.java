package com.AtGuiGu.Spring.bean;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-18:12
 */

public class Emp {
    private String ename;
    private String gender;

    //员工属于某一个部门,使用对象形式表示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void show(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
