package com.mark.DesignPatterns.proxy.proxyone;

public class LogUtil implements  Moveable{


    public MoveAction moveAction;

    public LogUtil(MoveAction moveAction) {
        this.moveAction = moveAction;
    }

    public void Start(){
        System.out.println("方法执行开始");
    }

    public void end(){
        System.out.println("方法执行结束");
    }


    @Override
    public void move() {
        Start();
        moveAction.move();
        end();
    }
}
