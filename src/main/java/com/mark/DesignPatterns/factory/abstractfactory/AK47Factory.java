package com.mark.DesignPatterns.factory.abstractfactory;

public class AK47Factory implements WeponFactory {

    @Override
    public WeponTool createWeponTool() {
        return new AK47();
    }
}
