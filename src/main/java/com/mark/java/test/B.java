package com.mark.java.test;

public abstract class B  extends A{

    @Override
    public void doA() {
        System.out.println("B类中doA方法");
    }

    @Override
    public void doB() {
        System.out.println("B类中doA方法");
        this.doVerfy();
        this.doSubmit();
    }

    public abstract void doVerfy();

    public abstract void doSubmit();
}
