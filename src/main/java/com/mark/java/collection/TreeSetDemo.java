package com.mark.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo implements Comparator {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
//        treeSet.add(1);
//        treeSet.add(2);
//        treeSet.add(3);
//        treeSet.add(4);
//        System.out.println(treeSet);

        //*******************************
        TreeSet treeSet2 = new TreeSet(new TreeSetDemo());
        treeSet2.add(new Person("zhsan","12"));
        treeSet2.add(new Person("lisi","14"));
        treeSet2.add(new Person("wwww","16"));
        treeSet2.add(new Person("zhaoliu","18"));
        System.out.println(treeSet2);
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(((Person)o1).personName.length()>((Person)o2).personName.length()){
            return 1;
        }else if(((Person)o1).personName.length()<((Person)o2).personName.length()){
            return -1;
        }else{
            return 0;
        }
    }
}
