package com.mark.DesignPatterns.singleton;

/**
 * 双重判断懒汉式。
 * 为什么要有两个判断呢，当然去掉外层的也是正确的，但是，会每次都执行synchronized (Mgr05.class)，所以加双重判断
 * 是有必要的
 */
public class Mgr05 {

    private static Mgr05 mgr05;

    private Mgr05(){

    }

    public static synchronized Mgr05 getInstance(){

        if(mgr05==null){
            synchronized (Mgr05.class){
                if(mgr05==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    mgr05 = new Mgr05();
                }
            }
        }
        return mgr05;
    }

    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
            new Thread(()->
                    System.out.println(Mgr05.getInstance().hashCode())
            ).start();
        }


    }
}
