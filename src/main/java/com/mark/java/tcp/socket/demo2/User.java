package com.mark.java.tcp.socket.demo2;

import java.io.Serializable;

public class User implements Serializable{


    public String userName;
    public String passWord;
    public int age;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}
