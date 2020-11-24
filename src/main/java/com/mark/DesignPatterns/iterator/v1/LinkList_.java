package com.mark.DesignPatterns.iterator.v1;

public class LinkList_ {

    private A head = null;
    private A tail = null;
    private int index = 0;


    public void add(Object o){
        A a = new A(o);
        a.next=null;
        if(head ==null){
            head = a;
            tail = a;
        }

        tail.next = a;//谁被add,谁就是当前tail的next的值
        tail = a;//谁被add,谁就是最后一个,也就是tail
        index ++;
    }


    public int size(){
        return index;
    }


    public Object get(int index){
        A a = head;
        int i = 0;
        while(i<index){
            A next = a.next;
            a = next;
            i++;
        }

        return a.obj;
    }


    public class A{

        Object obj;

        A next;

        public A(Object obj){
            this.obj = obj;
        }

    }




}
