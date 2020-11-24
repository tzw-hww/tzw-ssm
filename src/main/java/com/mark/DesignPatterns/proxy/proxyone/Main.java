package com.mark.DesignPatterns.proxy.proxyone;

public class Main {

    public static void main(String[] args) {

        new TimeUtils(new LogUtil(new MoveAction())).move();
    }

}
