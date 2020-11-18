package com.mark.DesignPatterns.factory.abstractfactory;
//西部牛仔
public class CowboyFactory implements AllFactory {
    @Override
    public MoveTool createMoveTool() {
        return new Car();
    }

    @Override
    public WeponTool createWeponTool() {
        return new AK47();
    }
}
