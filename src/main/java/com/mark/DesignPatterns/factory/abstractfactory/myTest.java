package com.mark.DesignPatterns.factory.abstractfactory;

public class myTest {


    /**
     *
      * @param args
     *
     * 抽象工厂模式
     * 工厂的接口  具体的工厂（多个）
     * 产品的接口   具体的产品（多个）
     * 组合工厂（不同工厂）    具体的族群（组合）工厂
     *
     *
     *
     */
    public static void main(String[] args) {
//        MoveTool c = new CarFactory().createMoveTool();
//        c.go();
//        WeponTool w = new AK47Factory().createWeponTool();
//        w.fire();
//        System.out.println("----------------------------");
//        MoveTool c1 = new TrainFactory().createMoveTool();
//        c1.go();
//        WeponTool w1 = new KnifeFactory().createWeponTool();
//        w1.fire();

//        CowboyFactory a = new CowboyFactory();
        RoiniFactory a = new RoiniFactory();
        a.createMoveTool().go();
        a.createWeponTool().fire();
    }


}
