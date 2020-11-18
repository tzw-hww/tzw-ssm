package com.mark.DesignPatterns.singleton;

/**
 * 同第一种
 */
public class Mgr02 {

    public static  Mgr02 mgr02;

    private Mgr02() {
    }

    static {
        mgr02 = new Mgr02();
    }


    public static Mgr02 getInstance(){
        return mgr02;
    }

    public static void main(String[] args) {

//        for (int i = 0; i <100 ; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Mgr02.getInstance().hashCode());
//                }
//            }).start();
//        }
        for (int i = 0; i <100 ; i++) {
            new Thread(()->
                    System.out.println(Mgr02.getInstance().hashCode())
            ).start();
        }


    }


}
