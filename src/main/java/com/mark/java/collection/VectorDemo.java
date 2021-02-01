package com.mark.java.collection;

import java.util.List;
import java.util.Vector;

/**
 * Vector和ArrayList的区别
 * 1. 底层都是数组实现的，扩容是，ArrayList一次扩容1.5倍， Vector扩容2倍
 * 2. ArrayList是线程不安全的，Vector方法有Sychronized修饰，是线程安全的。
 */
public class VectorDemo {
    public static void main(String[] args) {
        List list = new Vector();
        list.add(1);
        list.add("abc");
        System.out.println(list);

    }
}
