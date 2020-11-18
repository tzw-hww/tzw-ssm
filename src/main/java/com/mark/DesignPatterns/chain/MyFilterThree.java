package com.mark.DesignPatterns.chain;

public class MyFilterThree implements MyFilter{


    public boolean doFilter(Msg msg){

        String content = msg.getContent();

        content=content.replace("欢迎", "希望");
        msg.setContent(content);
        return true;
    }


}
