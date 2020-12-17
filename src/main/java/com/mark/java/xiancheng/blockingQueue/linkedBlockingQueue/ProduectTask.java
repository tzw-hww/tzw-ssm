package com.mark.java.xiancheng.blockingQueue.linkedBlockingQueue;

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
                blockingQueue.put(i);
                System.out.println(Thread.currentThread().getName()+"---"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
