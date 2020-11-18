package com.tzw.service;

import com.tzw.entity.EcifClient;
import com.tzw.util.TransactionUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.persistence.Query;
import javax.swing.*;
import javax.transaction.TransactionManager;
import java.util.List;
import java.util.Map;

@Service
public class CoreService {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSourceTransactionManager transactionManager;

    @Autowired
    TransactionTemplate transactionTemplate;

    @Autowired
    TransactionUtil transactionUtil;


    public void doSubmit_01(){
        TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);
        transactionTemplate.setIsolationLevel(TransactionDefinition.ISOLATION_DEFAULT);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {

                try{

                    //数据库数据操作.......

                }catch (Exception e){
                    transactionStatus.setRollbackOnly();
                }
            }
        });
    }


    public void doSubmit(){

        transactionUtil.open();
        try{

            //操作数据库操作.......

            transactionUtil.commit();
        }catch (Exception e){
            transactionUtil.rollBack();
        }
    }





//    public void doHiber(){
//
//
//
//        //获取一个session，多次获取都是同一个session,有就返回，没有就创建，总之就是一个session
//        //一般会使用这个
////        Session session = sessionFactory.getCurrentSession();
//
//        //打开一个session，就是每次调用都会新创建一个session
//        Session session = sessionFactory.openSession();
//
//        String sql = "select * from ecif_client";
//        NativeQuery nativeQuery = session.createNativeQuery(sql);
//        nativeQuery.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//        List<EcifClient> resultList = nativeQuery.getResultList();
//        System.out.println(resultList.toString());
//
//
//        String hql = "select c from EcifClient  c";
//        Query query = session.createQuery(hql,EcifClient.class);
//        List<EcifClient> resultList1 = query.getResultList();
//        System.out.println(resultList1.toString());
//
//    }










}
