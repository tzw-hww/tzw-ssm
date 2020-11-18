package com.mark.DesignPatterns.strategy.strasImp;

import com.mark.DesignPatterns.strategy.Comparator;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.food < o2.food) return -1;
        else if (o1.food > o2.food) return 1;
        else return 0;
    }
}
