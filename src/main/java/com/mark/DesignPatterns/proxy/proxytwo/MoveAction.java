package com.mark.DesignPatterns.proxy.proxytwo;

public class MoveAction implements Moveable {

    @Override
    public void move() {
        System.out.println("执行move");
    }
}
