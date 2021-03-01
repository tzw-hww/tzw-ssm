package com.mark.java.collection;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        //迭代器循环遍历
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------------");
        //如果在迭代器循环的过程中，删除一个数据，会怎么样?
        //1. 如果直接用list.remove()方法，会报错，java.util.ConcurrentModificationException，因为
        //    ArrayList使用数组实现的，当删除一个是，其他的数据都会向前移动，此时迭代器的指针不知道应该指向哪里就会报错
        //2. 但是可以用Iteratord的remove()方法，这个方法能够保证指针的指向正确。
        Iterator iterator1 = list.iterator();
        while(iterator1.hasNext()){
            Object o = iterator1.next();
            if(o.equals(1)){
//                list.remove(o); //报错：java.util.ConcurrentModificationException
                iterator1.remove();
            }
            System.out.println(o);
        }


        System.out.println("---------------");
        Iterator iterator2 = list.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("===============================");
        //ListIterator用法
        //1. 可以向后循环，也可以向前循环。
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        System.out.println("+++++++++++++++++++++++++++");
        //LinkedList 也可以用迭代器遍历
        LinkedList linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        Iterator iterator3 = linkedList.iterator();
        while(iterator3.hasNext()){
            Object next = iterator3.next();
            if("c".equals(next)){
                iterator3.remove();
            }
        }
        System.out.println(linkedList);
    }
}
