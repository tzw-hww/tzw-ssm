package com.mark.java.xiancheng;

public class JoinTest implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-------"+i);
        }
    }


    public static void main(String[] args) {

        JoinTest joinTest = new JoinTest();
        Thread thread = new Thread(joinTest);
        thread.start();


        for (int i = 0; i <10 ; i++) {
            if(i==3){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"========"+i);
        }



    }


}
