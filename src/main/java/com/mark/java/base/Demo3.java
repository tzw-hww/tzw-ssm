package com.mark.java.base;

public class Demo3 {
    private  String name;
    private  int age;

    public Demo3(){

    }

    /**
     * this用来区分参数变量和成员变量
     * @param name
     * @param age
     */
    public Demo3(String name,int age){
        this.name = name;
        this.age = age;

    }

    /**
     * 调用其他的构造方法，不能写为this.Demo3(..),可以省略方法名称
     * @param name
     */
    public Demo3(String name){
        this(name,0);
        System.out.println(name);
    }

    /**
     * this用来区分参数变量和成员变量
     * @param name
     */
    public void app(String name){
        System.out.println(name);
        System.out.println(this.name);
    }

    /**
     * 调用其他的方法
     */
    public void appOne(){
        this.app("zhangsan");
    }
}
