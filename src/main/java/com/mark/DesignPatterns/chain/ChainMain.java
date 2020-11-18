package com.mark.DesignPatterns.chain;

public class ChainMain {


    public static void main(String[] args) {


        String content = "<div>,欢迎大家996";
        Msg msg = new Msg();
        msg.setContent(content);

//        MyFilterOne myFilterOne = new MyFilterOne();
//        MyFilterTwo myFilterTwo = new MyFilterTwo();
//        List<MyFilter> filterList = new ArrayList<>();
//        filterList.add(myFilterOne);
//        filterList.add(myFilterTwo);
//        for (MyFilter myFilter : filterList) {
//            myFilter.doFilter(msg);
//        }

//        FilterChain chain = new FilterChain();
//        chain.add(new MyFilterOne()).add(new MyFilterTwo());
//        for (MyFilter myFilter : chain.list) {
//            myFilter.doFilter(msg);
//        }
        FilterChain chain = new FilterChain();
        chain.add(new MyFilterOne()).add(new MyFilterTwo());
//        chain.doFilter(msg);

        FilterChainTwo chainTwo = new FilterChainTwo();
        chainTwo.addFilter(new MyFilterThree()).addFilter(new MyFilterFour());
//        chainTwo.doFilter(msg);

        chain.add(chainTwo);
        chain.doFilter(msg);

        System.out.println(msg.toString());


    }









}
