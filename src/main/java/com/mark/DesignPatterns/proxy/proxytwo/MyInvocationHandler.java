package com.mark.DesignPatterns.proxy.proxytwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    public Moveable moveable;

    public MyInvocationHandler(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(moveable, args);
        return invoke;
    }
}
