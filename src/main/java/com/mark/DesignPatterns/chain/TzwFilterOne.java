package com.mark.DesignPatterns.chain;

public class TzwFilterOne implements Filter {
    @Override
    public boolean doFilter(Request request, Response response,MyFilterChain myFilterChain) {

        String req = request.getReq();
        req = req.replace("田", "我");
        request.setReq(req);

        myFilterChain.doFilter(request,response,myFilterChain);

        String res = response.getRes();
        res = res.replace("张", "风");
        response.setRes(res);

        return true;

    }
}
