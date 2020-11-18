package com.mark.DesignPatterns.factory.simplefactory;

public class myTest {

    //工厂模式就是工厂和产品之间的模式
    //简单工厂模式就是 产品的工厂生产产品
    public static void main(String[] args) {
        Car c = new CarFactory().createCar();
        c.go();
    }
}
