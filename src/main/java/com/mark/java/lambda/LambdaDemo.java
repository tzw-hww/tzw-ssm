package com.mark.java.lambda;

import java.util.function.*;

public class LambdaDemo {
    public static void main(String[] args) {

        //匿名内部类方式
        Consumer c = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str + "------");
            }
        };
        c.accept("abc");

        //lambda方式
        Consumer<String> c1 = (String str)->{
            System.out.println(str+"--------");
        };
        c1.accept("abcd");
        Consumer<String> c2 = (str)-> System.out.println(str+"----------");
        c2.accept("abcde");
        Consumer<String> c3 = str-> System.out.println(str+"--------");
        c3.accept("abcdef");

        //
        BiConsumer<String,Integer> bc  = new BiConsumer<String,Integer>() {
            @Override
            public void accept(String str, Integer i) {
                System.out.println(str+i);
            }
        };
        bc.accept("aaaa",5);
        BiConsumer<String,Integer> bc2 = (String str,Integer i)->{
            System.out.println(str+i);
            System.out.println("--------------");
        };
        bc2.accept("bbbbbbb",6);

        BiConsumer<String,Integer> bc3 = (str,i)->System.out.println(str+i);
        bc3.accept("ccccccccccc",7);


        Supplier s = new Supplier() {
            @Override
            public String get() {
                return "abc=========";
            }
        };
        System.out.println(s.get());
        Supplier s1 = ()->{return  "abc======";};
        System.out.println(s1.get());
        Supplier s2 = ()->"abc===========";
        System.out.println(s2.get());


        Function<String,Integer> f = new Function<String,Integer>() {
            @Override
            public Integer apply(String str) {
                return str.length();
            }
        };
        System.out.println(f.apply("abc"));
        Function<String,Integer> f1 = (String str)->{return str.length();};
        System.out.println(f1.apply("我的天"));

        Function<String,Integer> f2 = str->str.length();
        System.out.println(f2.apply("世上只有妈妈好"));


        BiFunction<String,String,Integer> bf = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply( String s1, String s2) {
                return s1.length()+s2.length();
            }
        };
        System.out.println(bf.apply("12345", "上山打老虎"));

        BiFunction<String,String,Integer> bf1 = (String str1,String str2)->{return str1.length()+str2.length();};
        System.out.println(bf1.apply("少年", "张三分"));
        BiFunction<String,String,Integer> bf2 = (str1,str2)-> str1.length()+str2.length();
        System.out.println(bf2.apply("常山", "赵子龙"));

//        BiFunction<String,String,Integer> bf3 = str1,str2-> str1.length()+str2.length();对于两个参数的，不能省略()，一个参数的可以

    }
}

