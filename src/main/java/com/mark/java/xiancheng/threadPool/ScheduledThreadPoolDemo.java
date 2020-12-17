package com.mark.java.xiancheng.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 可调度的线程执行器
 */
public class ScheduledThreadPoolDemo {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延时3秒执行");
            }
        },3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }

}
