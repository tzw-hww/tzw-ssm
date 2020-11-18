package com.mark.DesignPatterns.observer;

public class ObsEvent {

    public String location;

    public String time;

    public  Child source;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ObsEvent{" +
                "location='" + location + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
