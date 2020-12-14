package com.tzw.xiancheng.pc;

public class Goods {

    private String brand;

    private String name;

    //该标识为是否有生产的产品，如果有则为true,没有则为false. 默认为没有，需要先生产。
    private boolean flag = false;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public synchronized void set(String brand,String name){

        if(flag){
            //如果为true，表示产品存在，这时候不生产。阻塞，等待消费者消费。
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("成产了"+this.getBrand()+"---"+this.getName());
        flag = true;
        this.notify();
    }



    public synchronized void get(){
        if(!flag){
            //当flag为false,产品不存在的时候，消费者阻塞，等待生成者生成
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费了"+this.getBrand()+"---"+this.getName());
        flag = false;
        this.notify();
    }


}
