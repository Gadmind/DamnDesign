package com.daop.design.structural.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.structural.proxy.cglib
 * @Description:
 * @DATE: 2020-08-20
 * @AUTHOR: Administrator
 **/
public class Main {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E:\\class");
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new CglibMethodInterceptor());
        Person person = (Person)enhancer.create();
        person.method2();
    }
}
