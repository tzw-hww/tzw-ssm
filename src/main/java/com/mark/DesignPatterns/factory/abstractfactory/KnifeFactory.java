package com.mark.DesignPatterns.factory.abstractfactory;

public class KnifeFactory implements WeponFactory{

    @Override
    public WeponTool createWeponTool() {
        return new Knife();
    }
}
