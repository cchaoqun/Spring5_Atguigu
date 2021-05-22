package com.AtGuiGu.Spring;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-14:25
 */

public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public void eat(){
        System.out.println("User is eating...");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
