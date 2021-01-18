package com.mark.java.innerClass;

public class Demo4 {

    private String name;

    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("show");
    }

    public static void add(){
        System.out.println("add");
    }

    static class Demo4Inner{


        private String name;

        private static int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void show(){
            System.out.println("inner show");

            //内部类方法外部类
            System.out.println(Demo4.age);
            //静态内部类不能访问外部类非静态的方法和属性。
//            System.out.println(Demo4.this.name);
            Demo4.add();
        }
    }
}
