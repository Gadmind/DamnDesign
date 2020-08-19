package com.daop.design.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.structural.proxy.dynamicproxy
 * @Description:
 * @DATE: 2020-08-19
 * @AUTHOR: Administrator
 **/
public class ProxyInvocationHandler implements InvocationHandler {
    protected Subject subject;

    public ProxyInvocationHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理方法");
        return method.invoke(subject,args);
    }
}
