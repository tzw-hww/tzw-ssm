package com.mark.DesignPatterns.chain;

public class TzwFilterThree implements Filter {
    @Override
    public boolean doFilter(Request request, Response response,MyFilterChain myFilterChain) {

        String req = request.getReq();
        req = req.replace("伟", "谁");
        request.setReq(req);

        myFilterChain.doFilter(request,response,myFilterChain);

        String res = response.getRes();
        res = res.replace("山", "阳");
        response.setRes(res);

        return true;

    }
}
