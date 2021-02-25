package com.mark.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 1. new HashMap()
 *  initialCapacity 初始容量，初始1<<4,大小为16
 *  loadFactor 负荷系数，数量到达 容量*系数时，进行扩容
 *  MAXIMUM_CAPACITY 最大值为1<<30,2的30次方
 *           this.loadFactor = loadFactor;
 *         threshold = initialCapacity;
 * 2. put
 *  Entry是内部类
 *   key value next hash
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("a","1");
        map.put("b","2");
        System.out.println(map);
    }
}
