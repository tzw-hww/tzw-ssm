package com.mark.DesignPatterns.proxy.proxytwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        Moveable moveable = new MoveAction();
        ClassLoader classLoader = moveable.getClass().getClassLoader();

        Class<?>[] interfaces = moveable.getClass().getInterfaces();

//        InvocationHandler invocationHandler = new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                Object invoke = method.invoke(moveable,args);
//                return invoke;
//            }
//        };

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(moveable);
        Moveable moveableProxy = (Moveable) Proxy.newProxyInstance(classLoader, interfaces, myInvocationHandler);
        moveableProxy.move();
    }
}
