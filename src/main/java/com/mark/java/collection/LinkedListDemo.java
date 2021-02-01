package com.mark.java.collection;


import java.util.LinkedList;
import java.util.List;

/**
 * 采用链表的方式实现
 * 单向链表
 * 双向链表
 * Node： e,prev,next
 *
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(1);
        list.add("abc");
        System.out.println(list);

        Object o = list.get(0);
        System.out.println(o);

    }
}
