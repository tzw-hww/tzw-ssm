package com.mark.java.xiancheng;

/**
 * 注意这个继承的方式实现多线程，需要创建多个对象。每个如果ticket熟悉那个不加static时，每个对象都是从5开始，不能共享数据。
 * 所以需要加上static，将ticket变成类共享的数据。但是如果用实现接口的方式Runable就可以只创建一次对象实现。
 */
public class ThreadDemo  extends Thread {

    public static  int ticket = 5;

    @Override
    public void run() {

        for(int i=1;i<5;i++){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在售票"+(ticket--));
            }
        }

    }


    public static void main(String[] args) {

        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();
        ThreadDemo t4 = new ThreadDemo();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
