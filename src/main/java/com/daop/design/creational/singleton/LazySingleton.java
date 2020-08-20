package com.daop.design.creational.singleton;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.creational.singlten
 * @Description: 懒汉式单例
 * @DATE: 2020-08-20
 * @AUTHOR: Administrator
 **/
public class LazySingleton {
    /**
     * 初始化一个空的LazySingleton对象字段
     */
    private static LazySingleton instance;

    /**
     * 构造方法私有
     */
    private LazySingleton() {
    }

    /**
     * 获取LazySingleton唯一方式
     * @return LazySingleton对象
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
