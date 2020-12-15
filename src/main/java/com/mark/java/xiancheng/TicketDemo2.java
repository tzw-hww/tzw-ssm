package com.mark.java.xiancheng;

public class TicketDemo2 implements Runnable{

    private int ticket = 5;

    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
          this.sale();
        }

    }


    public synchronized void sale(){
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+"售票"+ticket--);
        }
    }



    public static void main(String[] args) {

        TicketDemo2 ticketDemo = new TicketDemo2();
        Thread t1 = new Thread(ticketDemo);
        Thread t2 = new Thread(ticketDemo);


        t1.start();
        t2.start();





    }
}
