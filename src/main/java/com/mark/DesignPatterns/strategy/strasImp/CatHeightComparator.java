package com.mark.DesignPatterns.strategy.strasImp;

import com.mark.DesignPatterns.strategy.Comparator;

public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.height > o2.height) return -1;
        else if (o1.height < o2.height) return 1;
        else return 0;
    }
}
