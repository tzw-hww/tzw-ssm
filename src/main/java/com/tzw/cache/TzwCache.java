package com.tzw.cache;


import org.springframework.cache.Cache;

import java.util.concurrent.Callable;
public class TzwCache implements Cache {


    public String myName;


    @Override
    public String getName() {
        System.out.println("getName");
        return this.myName;
    }

    @Override
    public Object getNativeCache() {
        System.out.println("getNativeCache");
        return null;
    }

    @Override
    public ValueWrapper get(Object o) {
        System.out.println("get");
        return null;
    }

    @Override
    public <T> T get(Object o, Class<T> aClass) {
        System.out.println("get1");
        return null;
    }

    @Override
    public <T> T get(Object o, Callable<T> callable) {
        System.out.println("get2");
        return null;
    }

    @Override
    public void put(Object o, Object o1) {
        System.out.println("put");
    }

    @Override
    public ValueWrapper putIfAbsent(Object o, Object o1) {
        System.out.println("putIfAbsent");
        return null;
    }

    @Override
    public void evict(Object o) {
        System.out.println("evict");
    }

    @Override
    public void clear() {

    }

    public void setMyName(String myName) {
        myName = this.myName;
    }
}
