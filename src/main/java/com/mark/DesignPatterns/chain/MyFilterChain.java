package com.mark.DesignPatterns.chain;

import java.util.ArrayList;
import java.util.List;

public class MyFilterChain implements Filter{

    List<Filter> list = new ArrayList<>();
    int i = 0;

    public void addFilter(Filter filter){
        list.add(filter);
    }

    public boolean doFilter(Request request,Response response,MyFilterChain myFilterChain){

        while(i<list.size()){
            Filter filter = list.get(i);
            i++;
            filter.doFilter(request, response, myFilterChain);
        }

        return true;
    }


}
