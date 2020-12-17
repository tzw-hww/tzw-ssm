package com.mark.java.xiancheng.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduledExecutorDemo2 {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(() ->
                System.out.println(Thread.currentThread().getName()+"延时1秒，每1秒执行一次,"),1,1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(() ->
                System.out.println(Thread.currentThread().getName()+"延时2秒，每2秒执行一次"),2,2,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(() ->
                System.out.println(Thread.currentThread().getName()+"延时3秒，每3秒执行一次"),3,3,TimeUnit.SECONDS);

//        scheduledExecutorService.shutdown();

    }
}
