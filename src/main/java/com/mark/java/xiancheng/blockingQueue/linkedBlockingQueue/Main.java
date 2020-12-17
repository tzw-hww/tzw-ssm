package com.mark.java.xiancheng.blockingQueue.linkedBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {


    public static void main(String[] args) {

        BlockingQueue blockingQueue = new ArrayBlockingQueue(5);
        ConsumerTask consumerTask = new ConsumerTask(blockingQueue);
        ProduectTask produectTask = new ProduectTask(blockingQueue);

        new Thread(consumerTask).start();
        new Thread(produectTask).start();
    }
}
