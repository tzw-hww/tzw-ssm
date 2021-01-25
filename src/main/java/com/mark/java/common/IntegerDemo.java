package com.mark.java.common;

import javax.persistence.criteria.CriteriaBuilder;

public class IntegerDemo {

    public static void main(String[] args) {

        //正常情况
        int a = 10;//基本类型定义
        Integer a1 = new Integer(10);//包装类定义

        //进行了自动装箱，相当于 Integer b = Integer.valueOf(10); 把int类型转为Integer类型
        Integer b = 10;
        //进行了自动拆箱，相当于 int b1 = new Integer(10).intValue(); 把Integer类型转为int类型
        int b1 = new Integer(10);

        //在这里不得不提到比较值  ==，看到等于我们应该想到是 对于引用变量来说是比较两个地址。对于基本类型来说就是比较值。

        //情况1
        int c = 10;
        int c1 = 10;
        c1 =20;
        //当int c=10;时，会在栈中存储一个10，c指向10；如果c1=10;则c1直接指向10；所以c==c1 为true。
        //虽然都指向10，但是如果此时 我们另 c1 = 20;,此时c的值并不会变化，还是指向10，只是在栈中在存储一个20，同时c1 指向 20,此时c ==c1为false
        System.out.println(c==c1); //true ,基本类型，直接比较值



        //情况2
        Integer d = new Integer(10);
        Integer d1 = new Integer(10);
        System.out.println(d == d1); //false ，引用类型，比较地址。

        //情况3
        Integer e = new Integer(10);
        int e1 = 10;
        //true,包装类和基本类型比较是，包装类会自动拆箱，int e2 = new Integer(10).intValue(); 在转换就是int e2 = 10;所以 e2==e1 为true
        System.out.println(e==e1);//true

        //情况4
        Integer f = 100;
        Integer f1 = 100;
        System.out.println(f==f1);//true;
        //这里其实需要自动装箱，变为
        Integer f2 = Integer.valueOf(100);
        Integer f3 = Integer.valueOf(100);
        //要判断f2 == f3 到底是什么，先不要急，我们需要先看一下valueOf()方法是怎么实现的
        //我们可以看到，是由一个if判断的，当满足if条件的时候，是从一个Integer数组中取出来的Integer对象，对于下标是100，取的对象都是同一个，所以f2 ==f3为ture
        System.out.println(f2==f3);//true

        System.out.println("---------------------------");
       //如果上述值变成 200；会怎么样呢
        Integer g = 200;
        Integer g1 = 200;
        System.out.println(g==g1);
        //这里其实需要自动装箱，变为
        Integer g2 = Integer.valueOf(200);
        Integer g3 = Integer.valueOf(200);
        System.out.println(g2==g3);
        //揭晓谜底，当值变为200的时候，就不满足if条件，而是new Integer()对象，所以
        //相当于
        Integer g4 = new Integer(200);
        Integer g5 = new Integer(200);
        System.out.println(g4==g5);
        //这就明确了吧，g4 == g5 一定为false



    }

 }
