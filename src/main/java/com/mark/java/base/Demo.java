package com.mark.java.base;

public class Demo {

    public int aaaa =0;

    public static void main(String[] args) {


        App app = new App();
        app.age=10;
        App app1 = new App();
        app1.age = 20;
        new Demo().change(app,app1);
        System.out.println(app.age);
        System.out.println(app1.age);
    }


    public void aa(App a){
        a.age = 9999;
    }


    public void change(App x,App y){
        App temp = x;
        x = y;
        y = temp;
        y.age = 111111;
        System.out.println(x.age);
        System.out.println(y.age);
    }
}
