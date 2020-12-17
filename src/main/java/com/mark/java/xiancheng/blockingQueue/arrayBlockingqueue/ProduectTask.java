package com.mark.java.xiancheng.blockingQueue.arrayBlockingqueue;

import java.util.concurrent.BlockingQueue;

public class ProduectTask implements Runnable {

    private BlockingQueue blockingQueue;

    public ProduectTask(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        for (int i = 0; i <5 ; i++) {
            try {
                System.out.println("放入"+Thread.currentThread().getName()+"---"+i);
                blockingQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
