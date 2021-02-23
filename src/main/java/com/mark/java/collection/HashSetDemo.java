package com.mark.java.collection;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        //Person对象中是否重写hashCode方法和equals方法。
        //如果重写了，则打印两个对象，没有重写则打印三个对象
        HashSet hashSet = new HashSet();
        hashSet.add(new Person("zhangsan","13"));
        hashSet.add(new Person("zhangsan","13"));
        hashSet.add(new Person("lisi","16"));
        System.out.println(hashSet);
    }
}
