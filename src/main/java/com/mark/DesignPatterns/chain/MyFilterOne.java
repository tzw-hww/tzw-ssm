package com.mark.DesignPatterns.chain;

public class MyFilterOne implements MyFilter{


    public boolean doFilter(Msg msg){

        String content = msg.getContent();

        content=content.replace("<", "");
        content=content.replace(">","");
        msg.setContent(content);
        return true;
    }


}
