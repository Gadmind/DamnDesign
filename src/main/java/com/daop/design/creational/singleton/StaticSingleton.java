package com.daop.design.creational.singleton;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.creational.singleton
 * @Description: 静态内部类单例模式
 * @DATE: 2020-08-20
 * @AUTHOR: Administrator
 **/
public class StaticSingleton {
    /**
     * 在类内部声明一个私有的静态类
     */
    private static class SingletonPlaceHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    /**
     * 私有构造方法
     */
    private StaticSingleton() {
    }

    /**
     * 获取该类实例的唯一方法
     *
     * @return StaticSingleton对象
     */
    public static final StaticSingleton getInstance() {
        return SingletonPlaceHolder.INSTANCE;
    }
}
