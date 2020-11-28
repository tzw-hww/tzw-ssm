package com.mark.DesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Child {


    List<Observer> list = new ArrayList<Observer>();
    {
        list.add(new MomObs());
        list.add(new DadObs());
        list.add(new Observer() {
            @Override
            public void obsHand(ObsEvent e) {
                System.out.println("pppppppppp");
            }
        });
    }
    public void wakeUp(ObsEvent e){
        for (Observer observer : list) {
            observer.obsHand(e);
        }
    }
}
