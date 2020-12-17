package com.mark.java.xiancheng.blockingQueue.arrayBlockingqueue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {


    public static void main(String[] args) {

        BlockingQueue blockingQueue = new LinkedBlockingQueue(5);
        ConsumerTask consumerTask = new ConsumerTask(blockingQueue);
        ProduectTask produectTask = new ProduectTask(blockingQueue);

        new Thread(produectTask).start();
        new Thread(consumerTask).start();
    }
}
