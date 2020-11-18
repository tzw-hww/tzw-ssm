package com.mark.DesignPatterns.singleton;

/**
 * 懒汉式
 * 解决线程不安全问题,加synchronized锁，同时会带来效率问题。
 */
public class Mgr04 {

    private static Mgr04 mgr04;

    private Mgr04(){

    }

    public static synchronized Mgr04 getInstance(){

        if(mgr04==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mgr04 = new Mgr04();
        }
        return mgr04;
    }

    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
            new Thread(()->
                    System.out.println(Mgr04.getInstance().hashCode())
            ).start();
        }


    }

}
