package com.mark.DesignPatterns.factory.abstractfactory;
//浪人
public class RoiniFactory implements AllFactory{
    @Override
    public MoveTool createMoveTool() {
        return new Train();
    }

    @Override
    public WeponTool createWeponTool() {
        return new Knife();
    }
}
