package com.mark.DesignPatterns.factory.factorymethod;

public class TrainFactory implements MoveFactory{

    @Override
    public MoveTool createMoveTool() {
        return  new Train();
    }
}
