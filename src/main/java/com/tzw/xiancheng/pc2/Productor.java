package com.tzw.xiancheng.pc2;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Productor implements Runnable {


    private BlockingQueue<Goods> blockingQueue;

    public Productor(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            Goods goods = new Goods();
            if(i%2==0){
                goods.set("娃哈哈","矿泉水");
            }else{
                goods.set("旺仔","小馒头");
            }
            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
