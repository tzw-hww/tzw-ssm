package com.mark.DesignPatterns.chain;

public class Main {


    public static void main(String[] args) {
        Request request = new Request();
        request.setReq("田志伟");

        Response response = new Response();
        response.setRes("张一山");

        MyFilterChain myFilterChain = new MyFilterChain();
        myFilterChain.addFilter(new TzwFilterOne());
        myFilterChain.addFilter(new TzwFilterTwo());
        myFilterChain.addFilter(new TzwFilterThree());
        myFilterChain.doFilter(request,response,myFilterChain);
        System.out.println(request.toString());
        System.out.println(response.toString());
    }
}
