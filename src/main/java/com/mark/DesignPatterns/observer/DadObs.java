package com.mark.DesignPatterns.observer;

public class DadObs implements Observer {

    @Override
    public void obsHand(ObsEvent e) {
        System.out.println("dad feed");
    }
}
