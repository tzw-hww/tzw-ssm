package com.mark.DesignPatterns.chain;

import java.util.ArrayList;
import java.util.List;

public class FilterChainTwo implements  MyFilter{

    List<MyFilter> list = new ArrayList<>();

    public FilterChainTwo addFilter(MyFilter myFilter){
        list.add(myFilter);
        return this;
    }


    public boolean doFilter(Msg msg){
        for (MyFilter myFilter : list) {
            boolean b = myFilter.doFilter(msg);
            if(!b){
                return false;
            }
        }
        return true;
    }

}
