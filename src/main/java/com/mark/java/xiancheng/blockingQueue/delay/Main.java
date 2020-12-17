package com.mark.java.xiancheng.blockingQueue.delay;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        DelayQueue delayQueue = new DelayQueue();
        delayQueue.add(new DelayTask("a",3, TimeUnit.SECONDS));
        try {
            DelayTask take = (DelayTask)delayQueue.take();
            System.out.println("延时3秒取出"+take.name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
