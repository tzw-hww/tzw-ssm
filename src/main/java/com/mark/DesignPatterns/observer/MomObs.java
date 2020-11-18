package com.mark.DesignPatterns.observer;

public class MomObs implements Observer{
    @Override
    public void obsHand(ObsEvent e) {
        System.out.println("mom hug");
    }
}
