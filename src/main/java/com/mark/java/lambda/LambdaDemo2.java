package com.mark.java.lambda;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo2 {


    public static void coo(String str){
        System.out.println("这个静态方法coo"+str);
    }
    public void coo2(String str){
        System.out.println("这个是实例方法"+str);
    }


    public static String sup(){
        return  "我爱中国";
    }
    public String sup2(){
        return "我爱中国2";
    }


    public static void bc(String a,Integer b){
        System.out.println("bc"+a+b);
    }
    public void bc2(String a,Integer b){
        System.out.println("bc"+a+b);
    }
    public void bc3(String b){
        System.out.println(b+"11111111111");
    }
    public void bc4(){
        System.out.println("66666666666666666666");
    }

    public static Integer fun(String str){
        return str.length();
    }
    public Integer fun2(String str){
        return str.length();
    }

    public static void main(String[] args) {

        //静态方法引用。对应语法(arg)->{类.staticMethod(arg)}  =====  类::staticMethod
        Supplier s = new Supplier() {
            @Override
            public String get() {
                return sup();
            }
        };
        System.out.println(s.get());
        Supplier<String> s1 = ()->{return sup();};
        System.out.println(s1.get());
        Supplier s2 = ()->sup();
        System.out.println(s2.get());
        Supplier s3 = LambdaDemo2::sup;
        System.out.println(s3.get());

        //实例方法
        LambdaDemo2 lambdaDemo2 = new LambdaDemo2();
        Supplier s4 = lambdaDemo2::sup2;
        System.out.println(s4.get());

        //无参构造引用
        Supplier<Person> s5 = Person::new;
        Supplier<Person> s6 =()->new Person();
        //--------------------------------------------Consumer----------------------------------------

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                coo(s);
            }
        };
        c.accept("aa");
        Consumer<String> c1 = (String str1)->{coo(str1); };
        c1.accept("bb");
        Consumer<String> c2 = str2 ->coo(str2);
        c2.accept("cc");
        //静态方法引用(arg)->类.staticMethod(arg)
        Consumer<String> c3 = LambdaDemo2::coo;
        c3.accept("dd");
        //实例方法引用 (arg)->实例.instMethod(arg)
        Consumer<String> c5 = str3->lambdaDemo2.coo2(str3);
        c5.accept("bbbbbbbb");
        //这里的泛型就和重要了，指的就是参数的类型
        Consumer<String> c4 = lambdaDemo2::coo2;
        c4.accept("aaaa");
        //对象方法引用 (inst,arg)->类.instMethod(arg) 注意区分静态方法引用
        Consumer <LambdaDemo2>  c6 = LambdaDemo2::bc4;
        c6.accept(lambdaDemo2);
        //有参的构造方法。(arg)->new lei(arg)
        Consumer<String> c8 = Person::new;
        c8.accept("aaaa");


        //================================BiConsumer==============================================
        BiConsumer<String, Integer> bc = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                bc(s,integer);
            }
        };
        bc.accept("a",1);
        BiConsumer<String, Integer> bc1 = (str,a)->bc(str,a);
        bc1.accept("b",2);
        BiConsumer<String,Integer> bc2 = LambdaDemo2::bc;
        BiConsumer<String,Integer> bc3 = lambdaDemo2::bc2;
        //对象方法引用(inst,arg)->{类名.instmethod(arg)}
        BiConsumer<LambdaDemo2,String> bc4 = LambdaDemo2::bc3;
        bc4.accept(lambdaDemo2,"ccccccc");

        BiConsumer<LambdaDemo2,String> bc5 = (LambdaDemo2,stro)->lambdaDemo2.bc3(stro);
        bc5.accept(lambdaDemo2,"ddddddd");




        //-------------------Function-------------------------------------
        Function<String,Integer> fun = LambdaDemo2::fun;
        System.out.println(fun.apply("aaaaa"));
        Function<String,Integer> fun2 = lambdaDemo2::fun2;
        System.out.println(fun2.apply("bbbbbb"));





    }



}


class Person{

    public Person(){
        System.out.println("无参构造方法");
    }

    public Person(String name){
        System.out.println("name构造方法"+name);
    }


}