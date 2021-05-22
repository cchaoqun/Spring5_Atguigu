package com.AtGuiGu.Spring.bean;

/**
 * 部门类
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-18:12
 */

public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
