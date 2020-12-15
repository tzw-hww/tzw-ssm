package com.mark.java.xiancheng;

public class TicketDemo implements Runnable{

    private int ticket = 5;

    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
           synchronized (this){
               if(ticket>0){
                   System.out.println(Thread.currentThread().getName()+"售票"+ticket--);
               }
           }
        }

    }




    public static void main(String[] args) {

        TicketDemo ticketDemo = new TicketDemo();
        Thread t1 = new Thread(ticketDemo);
        Thread t2 = new Thread(ticketDemo);


        t1.start();
        t2.start();





    }
}
