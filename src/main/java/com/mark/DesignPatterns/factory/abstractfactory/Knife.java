package com.mark.DesignPatterns.factory.abstractfactory;

public class Knife implements WeponTool {
    @Override
    public void fire() {
        System.out.println("刀 砍");
    }
}
