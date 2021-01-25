package com.mark.java.innerClass;

import org.springframework.aop.ThrowsAdvice;

public class Demo3{

    public void aaa(final  int a){
        //不知道内部类的名称，叫匿名内部类。
        //2. 匿名内部类适合只使用一次的类，一般来说，匿名内部类用于继承其他类或是实现接口，并不需要增加额外的方法，只是对继承方法的实现或是重写。
        //3. 匿名内部类在编译后会默认生成一个Outter$1.class，匿名内部类时唯一没有构造方法的类。
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类开始了"+a);
            }
        }).start();

        //同时可以写成成员变量的写法。这里起了名字一个类A。
        new Thread(new A()).start();
    }

    class A implements Runnable{

        @Override
        public void run() {
            System.out.println("不是匿名内部类的方式");
        }
    }
}
