package com.AtGuiGu.Spring5_AutoWire;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-17:44
 */

public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
