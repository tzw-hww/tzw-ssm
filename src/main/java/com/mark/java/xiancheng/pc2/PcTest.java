package com.mark.java.xiancheng.pc2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PcTest {


    public static void main(String[] args) {

        BlockingQueue<Goods> blockingQueue = new ArrayBlockingQueue(5);
        Productor productor = new Productor(blockingQueue);
        Thread ProThread = new Thread(productor);
        ProThread.start();

        Consumer consumer = new Consumer(blockingQueue);
        Thread conThread = new Thread(consumer);
        conThread.start();


    }

}
