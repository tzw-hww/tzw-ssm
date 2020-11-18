package com.tzw.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
public class TransactionUtil {

    @Autowired
    DataSourceTransactionManager transactionManager;

    TransactionStatus transactionStatus;

    /**
     * 开启事务
     */
    public void open(){

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setIsolationLevel(TransactionDefinition.ISOLATION_DEFAULT);
        transactionStatus = transactionManager.getTransaction(def);
    }

    /**
     * 提交事务
     */
    public void commit(){
        transactionManager.commit(transactionStatus);
    }

    /**
     * 回滚事务
     */
    public void  rollBack(){
        transactionManager.rollback(transactionStatus);
    }


}
