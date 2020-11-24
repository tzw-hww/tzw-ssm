package com.mark.DesignPatterns.proxy.cglib;

import java.util.Random;

public class Tank {


    public void move(){
        System.out.println("tank 移动。。。。。。。。。");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void aaaa(){
        System.out.println("aaaaaaaa");
    }
}
