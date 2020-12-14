package com.tzw.xiancheng.pc2;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Goods> blockingQueue;

    public Consumer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费者消费"+goods.getBrand()+"--"+goods.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
