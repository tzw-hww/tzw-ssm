package com.mark.DesignPatterns.singleton;

public enum Mgr07 {

    INSTANCE;

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.INSTANCE.hashCode());
            }).start();
        }
    }
}
