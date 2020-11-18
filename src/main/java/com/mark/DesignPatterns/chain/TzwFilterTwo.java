package com.mark.DesignPatterns.chain;

public class TzwFilterTwo implements Filter {
    @Override
    public boolean doFilter(Request request, Response response,MyFilterChain myFilterChain) {


        String req = request.getReq();
        req = req.replace("志", "是");
        request.setReq(req);

        myFilterChain.doFilter(request,response,myFilterChain);

        String res = response.getRes();
        res = res.replace("一", "清");
        response.setRes(res);

        return true;
    }
}
