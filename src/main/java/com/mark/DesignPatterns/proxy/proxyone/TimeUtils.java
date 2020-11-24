package com.mark.DesignPatterns.proxy.proxyone;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class TimeUtils implements Moveable{

    public Moveable moveable;

    public TimeUtils(Moveable moveable) {
        this.moveable = moveable;
    }

    public void startTime(){
        System.out.println(new Date());
    }

    public void endTime(){
        System.out.println(new Date());
    }


    @Override
    public void move() {
        startTime();
        moveable.move();
        startTime();
    }
}
