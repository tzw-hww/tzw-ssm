package com.mark.DesignPatterns.factory.factorymethod;

public class CarFactory implements MoveFactory{

    @Override
    public MoveTool createMoveTool() {
        return   new Car();
    }
}
