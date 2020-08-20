package com.daop.design.structural.proxy.cglib;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.structural.proxy.cglib
 * @Description:
 * @DATE: 2020-08-20
 * @AUTHOR: Administrator
 **/
public class Person {
    final public void method1(String param){
        System.out.println("Person"+param+"!");
    };
    public void method2(){
        System.out.println("Person!");
    }
}
