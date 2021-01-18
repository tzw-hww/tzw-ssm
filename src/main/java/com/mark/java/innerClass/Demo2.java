package com.mark.java.innerClass;

public class Demo2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(Demo2 demo2){

        System.out.println("show");

        //方法内部类，是局部内部类，只在该方法内部有意义，所以外部是无法创建该类的对象的，所以该类只能在方法内部使用。
        class Demo2Inner{

            private String name;

            public void show(){
                System.out.println(this.name);
                System.out.println(Demo2.this.name);
                System.out.println(demo2.getName());
            }
        }
        Demo2Inner demo2Inner = new Demo2Inner();
        demo2Inner.name = "bbbbb";
        demo2Inner.show();
    }
}

