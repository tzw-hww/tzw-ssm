package com.mark.java.common;

public class StringDemo {

    public static void main(String[] args) {

        //情况1
        String  a = "abc";
        String  a1 = "abc";
        //a 和 a1都指向常量池中的"abc"
        System.out.println(a==a1);//true

        //情况2
        String b = new String("abc");
        String b1 = new String("abc");
        //b 和 b1 分别指向堆中不同的对象
        System.out.println(b==b1);//false

        //情况3
        String c = "abc";
        String c1 = new String("abc");
        //c 指向常量池中的"abc",而c1执行堆中的 对象
        System.out.println(c==c1);//false
        //调用intern方法，c1指向 将常量池中的"abc"，c也指向池中的"abc"，所以c1 ==c
        c1 = c1.intern();
        System.out.println(c==c1);//true
        System.out.println("-----------------------------------------");



        //情况4，Stirng 中出现 + 的情况
        String d = "abc";
        String d1 = "efg";
        String d2 = "abcefg";
        String d3 = "abc"+"efg";
        String d4 = d+d1;
        System.out.println(d2==d3);//true
        System.out.println(d2==d4);//false



    }
}
