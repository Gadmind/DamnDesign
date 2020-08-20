package com.daop.design.creational.singleton;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.creational.singleton
 * @Description: 饿汉式单例
 * @DATE: 2020-08-20
 * @AUTHOR: Administrator
 **/
public class HungrySingleton {
    /**
     * 实例化HungrySingleton
     */
    private static HungrySingleton instance = new HungrySingleton();

    /**
     * 构造方法私有化
     */
    private HungrySingleton() {
    }

    /**
     * 获取实例的唯一方式
     *
     * @return HungrySingleton对象
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
