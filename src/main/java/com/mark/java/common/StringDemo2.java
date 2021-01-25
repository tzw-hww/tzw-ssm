package com.mark.java.common;

import java.util.ArrayList;
import java.util.List;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "abc";
        int ec = str.compareTo("abc");
        System.out.println(ec);

        System.out.println(str.concat("efg"));

        System.out.println(str.contentEquals(new StringBuffer("abc")));

        System.out.println(String.join("-","I","love","you"));
        List<String> list = new ArrayList<>();
        list.add("我是");
        list.add("一只");
        list.add("可爱的");
        list.add("小猫");
        System.out.println(String.join("--",list));

        StringBuffer stringBuffer = new StringBuffer("");

    }
}
