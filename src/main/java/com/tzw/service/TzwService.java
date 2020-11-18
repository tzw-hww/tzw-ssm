package com.tzw.service;

import com.tzw.entity.EcifClient;
import com.tzw.mapper.EcifClientMapper;
import com.tzw.util.TransactionUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
@Service
public class TzwService  {


    @Autowired
    TransactionUtil transactionUtil;

    @Autowired
    EcifClientMapper ecifClientMapper;

    public void getClient(){

        List<Map<String, Object>> maps = ecifClientMapper.selectAllList();
        System.out.println(maps.toString());


    }


    public void updateClient_01(){


        transactionUtil.open();
        try{
            System.out.println("开始执行新增----");
            EcifClient ecifClient = new EcifClient();
            ecifClient.setClientId("0000000008");
            ecifClient.setClientName("王五");
            ecifClient.setClientNameEn("wu");
            int insert = ecifClientMapper.insert(ecifClient);

            System.out.println("执行完成了新增----");

            EcifClient ecifClient1 = new EcifClient();
            ecifClient1.setClientId("0000000001");
            ecifClient1.setClientName("张三------------123133333333333333333333333333333333321323233333333333333333333333333");
            ecifClient1.setClientNameEn("zs============");
            int i = ecifClientMapper.updateByPrimaryKey(ecifClient1);
            transactionUtil.commit();
        }catch (Exception e){
            System.out.println("抛出异常");
            transactionUtil.rollBack();
        }

    }



    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void updateClient(){
            System.out.println("开始执行新增----");
            EcifClient ecifClient = new EcifClient();
            ecifClient.setClientId("0000000008");
            ecifClient.setClientName("王五");
            ecifClient.setClientNameEn("wu");
            int insert = ecifClientMapper.insert(ecifClient);

            System.out.println("执行完成了新增----");

            EcifClient ecifClient1 = new EcifClient();
            ecifClient1.setClientId("0000000001");
            ecifClient1.setClientName("张三------------123133333333333333333333333333333333321323233333333333333333333333333");
            ecifClient1.setClientNameEn("zs============");
            int i = ecifClientMapper.updateByPrimaryKey(ecifClient1);
            transactionUtil.commit();

    }


    @Cacheable(value = "tzwCache2")
    public EcifClient getClientById(String clientId){

        System.out.println("进入方法中，查询数据库");
        EcifClient ecifClient = new EcifClient();
        ecifClient.setClientId("0000000001");
        EcifClient ecifClient1 = ecifClientMapper.selectByPrimaryKey(ecifClient);
        System.out.println(ecifClient1.toString()+"-------");
        return ecifClient1;
    }

}
