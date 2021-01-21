package com.mark.java.base;

public class ExceptionDemo {

    public static  void test(){

    }

    public static  void test2(){

    }

    public void a(){

        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            test2();
        }

    }
}
