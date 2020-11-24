package com.mark.DesignPatterns.proxy.proxyone;

public class Proxy {


    public Moveable moveable;

    public Proxy(Moveable moveable) {
        this.moveable = moveable;
    }

    public void move() {

        moveable.move();
    }
}
