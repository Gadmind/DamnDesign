package com.daop.design.structural.proxy.staticproxy;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.structural.proxy.staticproxy
 * @Description: 静态代理类
 * @DATE: 2020-08-19
 * @AUTHOR: Administrator
 **/
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String action() {
        System.out.println("主体Subject执行前");
        String result=this.subject.action();
        System.out.println("主体Subject执行后");
        return result;
    }
}
