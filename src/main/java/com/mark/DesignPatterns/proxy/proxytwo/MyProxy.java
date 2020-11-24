package com.mark.DesignPatterns.proxy.proxytwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy {


    public Moveable moveable;

    public MyProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    public void getProxy(){

        ClassLoader classLoader = moveable.getClass().getClassLoader();

        Class<?>[] interfaces = moveable.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = method.invoke(moveable,args);
                return invoke;
            }
        };


        Moveable moveable = (Moveable) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        moveable.move();
    }
}
