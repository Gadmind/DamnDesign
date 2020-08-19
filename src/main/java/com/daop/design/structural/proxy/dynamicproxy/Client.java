package com.daop.design.structural.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.structural.proxy.dynamicproxy
 * @Description:
 * @DATE: 2020-08-19
 * @AUTHOR: Administrator
 **/
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(realSubject);
        Subject proxySubject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), proxyInvocationHandler);
        proxySubject.action();
    }
}
