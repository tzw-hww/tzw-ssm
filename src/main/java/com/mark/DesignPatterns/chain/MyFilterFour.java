package com.mark.DesignPatterns.chain;

public class MyFilterFour implements MyFilter{


    public boolean doFilter(Msg msg){

        String content = msg.getContent();
        content=content.replace("大家","大家加加加加");
        msg.setContent(content);
        return true;
    }


}
