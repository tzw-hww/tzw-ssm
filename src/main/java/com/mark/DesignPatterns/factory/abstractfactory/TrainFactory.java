package com.mark.DesignPatterns.factory.abstractfactory;

public class TrainFactory implements MoveFactory {

    @Override
    public MoveTool createMoveTool() {
        return  new Train();
    }
}
