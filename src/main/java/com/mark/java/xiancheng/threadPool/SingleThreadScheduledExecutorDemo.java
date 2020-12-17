package com.mark.java.xiancheng.threadPool;

import com.mark.DesignPatterns.proxy.proxyone.TimeUtils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduledExecutorDemo {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(() ->
                System.out.println(Thread.currentThread().getName()+"延时1秒执行"),1, TimeUnit.SECONDS);

        scheduledExecutorService.schedule(() ->
                System.out.println(Thread.currentThread().getName()+"延时2秒执行"),2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(() ->
                System.out.println(Thread.currentThread().getName()+"延时3秒执行"),3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

    }
}
