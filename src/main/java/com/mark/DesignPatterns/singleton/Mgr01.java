package com.mark.DesignPatterns.singleton;

/**
 * 类加载的时候就会创建对象,且每次都会
 * 饿汉式
 *
 */
public class Mgr01 {

    public static Mgr01 mgr01 = new Mgr01();

    private Mgr01(){

    }

    public static Mgr01 getInstance(){
        return mgr01;
    }


    public static void main(String[] args) {
        Mgr01 instance01 = Mgr01.getInstance();
        Mgr01 instance02 = Mgr01.getInstance();
        System.out.println(instance01==instance02);
    }


}
