package com.mark.DesignPatterns.chain;

public class Msg {

    public String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "content='" + content + '\'' +
                '}';
    }
}
