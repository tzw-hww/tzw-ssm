package com.mark.DesignPatterns.proxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        //这个o是被代理类的子类。
        System.out.println(o.getClass().getSuperclass().getName());
        //method是调用的方法。
        System.out.println(method.getName());
        System.out.println("before");
        //这里用的是methodProxy.invokeSuper(o, objects)，注意是invokeSuper方法，不是invoke方法
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return invoke;
    }
}
