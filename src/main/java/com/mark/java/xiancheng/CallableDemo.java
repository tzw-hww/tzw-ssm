package com.mark.java.xiancheng;

import java.util.concurrent.Callable;

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Runnable is running...");
            }
        }).start();


        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "callable is running";
            }
        };
        String call = callable.call();
        System.out.println(call);
    }
}
