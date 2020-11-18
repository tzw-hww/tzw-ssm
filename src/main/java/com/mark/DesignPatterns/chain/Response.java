package com.mark.DesignPatterns.chain;

public class Response {

    String res;

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Response{" +
                "res='" + res + '\'' +
                '}';
    }
}
