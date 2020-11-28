package com.mark.java.xiancheng;

/**
 * 实现Runnable接口 比 继承Thread的好处
 * 1. java是单继承的，所以将继承的机会给最需要的类。
 * 2. 实现接口的方式只需要创建一个对象就可以，然后通过Thread的代理的方式执行run方法
 *     而继承的方式，则需要new多个对象去执行
 */
public class RunnableDemo implements Runnable {

    public int tickets = 5;
    @Override
    public void run() {
        for(int i=1;i<56;i++){
            if(tickets>0){
                System.out.println(Thread.currentThread().getName()+"正在售票"+(tickets--));
            }
        }
    }

    public static void main(String[] args) {

        RunnableDemo runnableDemo = new RunnableDemo();
        Thread t1 = new Thread(runnableDemo);
        Thread t2 = new Thread(runnableDemo);
        Thread t3 = new Thread(runnableDemo);
        Thread t4 = new Thread(runnableDemo);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
