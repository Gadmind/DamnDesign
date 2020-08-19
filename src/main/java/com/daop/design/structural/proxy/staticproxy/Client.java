package com.daop.design.structural.proxy.staticproxy;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.structural.proxy.staticproxy
 * @Description: 客户端
 * @DATE: 2020-08-19
 * @AUTHOR: Administrator
 **/
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(subject);
        proxySubject.action();
    }
}
