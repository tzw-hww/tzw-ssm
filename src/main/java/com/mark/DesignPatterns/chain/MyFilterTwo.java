package com.mark.DesignPatterns.chain;

public class MyFilterTwo implements MyFilter{


    public boolean doFilter(Msg msg){

        String content = msg.getContent();
        content=content.replace("996","995");
        msg.setContent(content);
        return true;
    }


}
