package com.mark.java.xiancheng.threadPool;

public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(Thread.currentThread().getName()+"------------");
    }
}
