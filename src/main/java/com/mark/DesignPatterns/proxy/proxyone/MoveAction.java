package com.mark.DesignPatterns.proxy.proxyone;

public class MoveAction implements  Moveable{
    @Override
    public void move() {
        System.out.println("执行move方法");
    }
}
