package com.tzw.xiancheng.pc;

public class PcTest {


    public static void main(String[] args) {


        Goods goods = new Goods();
        Productor productor = new Productor(goods);
        Thread ProThread = new Thread(productor);
        ProThread.start();

        Consumer consumer = new Consumer(goods);
        Thread conThread = new Thread(consumer);
        conThread.start();


    }

}
