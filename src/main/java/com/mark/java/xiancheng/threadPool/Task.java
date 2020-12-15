package com.mark.java.xiancheng.threadPool;

public class Task implements Runnable {
    @Override
    public void run() {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+"------------");
    }
}
