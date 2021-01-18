package com.mark.java.base;

import java.sql.SQLOutput;

public class Cat extends Pet{


    private String eyeType;

    public String getEyeType() {
        return eyeType;
    }

    public void setEyeType(String eyeType) {
        this.eyeType = eyeType;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyeType='" + eyeType + '\'' +
                '}';
    }

    public static String bbb;

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("小木木");
        cat.setAge(13);
        cat.setGender("女");
        cat.setEyeType("大");
        System.out.println(cat);
        System.out.println(cat.aaa);
        System.out.println(cat.bbb);

    }

    public Cat(){
        this.toString();
    }

}
