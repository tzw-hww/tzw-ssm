package com.mark.java.xiancheng.blockingQueue.linkedBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerTask implements Runnable {

    private BlockingQueue blockingQueue;

    public ConsumerTask(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        for (int i = 0; i <5 ; i++) {
            try {
                Object take = blockingQueue.take();
                System.out.println("消费者消费"+Thread.currentThread().getName()+"----"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
