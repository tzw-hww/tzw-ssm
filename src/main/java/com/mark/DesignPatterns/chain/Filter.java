package com.mark.DesignPatterns.chain;

public interface Filter {

    public boolean doFilter(Request request, Response response, MyFilterChain myFilterChain);
}
