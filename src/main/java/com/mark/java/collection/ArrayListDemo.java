package com.mark.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,99 );
        System.out.println(list);

        List list2 = new ArrayList();
        list2.add(100);
        list2.add(101);
        list.addAll(list2);
        System.out.println(list);

        list.addAll(1,list2);
        System.out.println(list);
//        list.clear();
//        System.out.println(list);

        //复制
        Object clone = ((ArrayList) list).clone();
        System.out.println(clone);
        //是否包含元素或者集合
        System.out.println(list.contains(1));
        System.out.println(list.containsAll(list2));
        //根据索引获取对象
        System.out.println(list.get(1));
        //获取对象的第一个索引
        System.out.println(list.indexOf(100));
        //获取对象的最后一个索引
        System.out.println(list.lastIndexOf(100));


        Object remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);
        //remove掉出现的第一个值
        System.out.println(list.remove(new Integer(101)));
        System.out.println(list);

        System.out.println(list.removeAll(list2));
        System.out.println(list);

        List list3 = list.subList(1, 3);
        System.out.println(list3);

        Object[] objects = list.toArray();

        boolean b = list.retainAll(list2);
        System.out.println(list);



    }
}
