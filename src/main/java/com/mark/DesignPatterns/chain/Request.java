package com.mark.DesignPatterns.chain;

public class Request {

    String req;

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    @Override
    public String toString() {
        return "Request{" +
                "req='" + req + '\'' +
                '}';
    }
}
