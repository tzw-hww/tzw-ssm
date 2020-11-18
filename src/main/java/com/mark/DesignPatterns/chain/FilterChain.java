package com.mark.DesignPatterns.chain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements MyFilter{

    public List<MyFilter> list  = new ArrayList<>();

    /**
     * 添加一个filter，变成一个链条
     * @param myFilter
     * @return
     */
    public FilterChain add(MyFilter myFilter){
        list.add(myFilter);
        return this;
    }


    /**
     * 执行整个链条
     * @param msg
     */
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




