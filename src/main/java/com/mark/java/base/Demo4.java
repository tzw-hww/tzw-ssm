package com.mark.java.base;

public class Demo4 {
    {
        System.out.println("构造代码块");
    }
    public void app(){
        System.out.println("app");
        {
            System.out.println("普通代码块");
        }
    }
    static{
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        demo4.app();
    }
}
