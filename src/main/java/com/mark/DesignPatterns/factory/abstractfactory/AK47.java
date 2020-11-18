package com.mark.DesignPatterns.factory.abstractfactory;

public class AK47 implements WeponTool {
    @Override
    public void fire() {
        System.out.println("AK47 发射");
    }
}
