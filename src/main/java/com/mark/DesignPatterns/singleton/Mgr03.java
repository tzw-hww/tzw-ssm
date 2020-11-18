package com.mark.DesignPatterns.singleton;

/**
 * 懒汉式，也称懒加载，用的时候在创建.
 * 存在问题，当多线程访问的时候，在判断处可能多个线程判断为，所以会创建多个对象
 * 线程不安全。
 */
public class Mgr03 {

    private static Mgr03 mgr03;

    private Mgr03(){

    }


    public static Mgr03 getInstance(){

        if(mgr03==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mgr03 = new Mgr03();
        }
        return mgr03;
    }

    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
            new Thread(()->
                    System.out.println(Mgr03.getInstance().hashCode())
            ).start();
        }


    }

}
