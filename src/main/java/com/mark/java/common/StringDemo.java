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
        //对于d3，直接去池中找abcefg，所以d2和 d3 指向的时一致的，所以相等
        System.out.println(d2==d3);//true

        //对于d4,是 d+d1,是引用变量的相加，是地址的相加，不是值得相加
        //其实在内部会创建一个StringBuilder的对象
        System.out.println(d2==d4);//false
        //相当于
        StringBuilder stringBuilder = new StringBuilder().append(d).append(d1);
        String s = stringBuilder.toString();
        //而下面是StringBuilder的toString方法，就是new String（）创建了一个新对象。所以为false
        //public String toString() {
        //        // Create a copy, don't share the array
        //        return new String(value, 0, count);
        //    }




    }
}
