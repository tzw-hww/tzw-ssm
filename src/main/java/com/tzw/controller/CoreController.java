package com.tzw.controller;

import com.tzw.entity.EcifClient;
import com.tzw.service.CoreService;
import com.tzw.service.TzwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoreController {


    @Autowired
    CoreService coreService;

    @Autowired
    TzwService tzwService;

    @RequestMapping("/test")
    @ResponseBody
    public String getStr(){

        return "张三1111111111111";
    }

    @RequestMapping("/getClient")
    public void getClientList(){

        coreService.doSubmit();


    }

//    @RequestMapping("/getHiberClient")
//    public void getHiberClient(){
//        coreService.doHiber();
//    }


    @RequestMapping("/getEcifClient")
    @ResponseBody
    public String getClient(){

        tzwService.getClient();

        tzwService.updateClient();
        return "sessecful";
    }

    @RequestMapping("/getEcifClient1")
    @ResponseBody
    public String getClientById(){

        EcifClient clientById = tzwService.getClientById("0000000001");

        return clientById.toString();
    }

}
