package com.daop.design.structural.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.structural.proxy.cglib
 * @Description: 方法拦截器
 * @DATE: 2020-08-20
 * @AUTHOR: Administrator
 **/
public class CglibMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Enhancer target Class");
        Object object = proxy.invokeSuper(obj,args);
        return object;
    }
}
