package com.mark.java.innerClass;

public class Main {

    public static void main(String[] args) {

        Demo demo = new Demo();
        Demo.DemoInner demoInner = demo.new DemoInner();
        demo.setName("zhangsan");

        demoInner.showInner();
        demoInner.setName("lisi");

        demoInner.test();

    }
}
