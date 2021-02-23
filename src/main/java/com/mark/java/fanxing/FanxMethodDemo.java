package com.mark.java.fanxing;

public class FanxMethodDemo<E> {

    private E e;

    public void set(E e){
        this.e = e;
    }

    public <Q>Q show(Q q){
        System.out.println(e);
        System.out.println(q);
        return q;
    }



    public static void main(String[] args) {
        FanxMethodDemo<String> fanxMethodDemo = new FanxMethodDemo();
        fanxMethodDemo.set("abc");
        String a = fanxMethodDemo.show("zhangsan");
        System.out.println(a);
    }
}
