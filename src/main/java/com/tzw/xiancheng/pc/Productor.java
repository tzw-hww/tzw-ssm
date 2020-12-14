package com.tzw.xiancheng.pc;

import static java.lang.Thread.sleep;

public class Productor implements Runnable {


    private Goods goods;

    public Productor(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            if(i%2==0){
                goods.set("娃哈哈","矿泉水");
            }else{
                goods.set("旺仔","小馒头");
            }
        }

    }



}
