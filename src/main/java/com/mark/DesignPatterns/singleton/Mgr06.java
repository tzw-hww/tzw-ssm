package com.mark.DesignPatterns.singleton;

/**
 * 静态内部类实现
 * 这里也可以称为懒汉式，
 * 加载外部类时，静态内部类不会加载。
 */
public class Mgr06 {

    private Mgr06() {
    }

    //静态内部类
    private static class Mgr06Holder {
        private final static Mgr06 INSTANCE = new Mgr06();
    }

    //在静态方法中调用静态内部类。至于为什么每次能返回同一个对象，而不是每次有创建新对象
    //这是有jvm给实现的。JVM保证单例
    public static Mgr06 getInstance() {
        return Mgr06Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
