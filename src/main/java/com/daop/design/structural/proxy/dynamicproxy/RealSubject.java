package com.daop.design.structural.proxy.dynamicproxy;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.structural.proxy.staticproxy
 * @Description: 主体类
 * @DATE: 2020-08-19
 * @AUTHOR: Administrator
 **/
public class RealSubject implements Subject {
    @Override
    public String action() {
        System.out.println("action in RealSubject");
        return "RealSubject";
    }
}
