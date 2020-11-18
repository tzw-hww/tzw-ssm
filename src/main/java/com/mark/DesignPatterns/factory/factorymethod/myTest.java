package com.mark.DesignPatterns.factory.factorymethod;

public class myTest {

    //工厂方法模式
    //工厂的接口，具体的工厂，
    //产品的接口， 具体的产品
    //用具体的工厂生成产品。
    public static void main(String[] args) {
        MoveTool c = new CarFactory().createMoveTool();
        c.go();
    }
}
