package com.daop.design.creational.singleton;

/**
 * @BelongsProject: damndesign
 * @BelongsPackage: com.daop.design.creational.singleton
 * @Description: 双重锁检查单例模式
 * @DATE: 2020-08-20
 * @AUTHOR: Administrator
 **/
public class DoubleCheckedSingleton {
    /**
     * 初始化一个空的DoubleCheckedSingleton对象字段
     */
    private volatile static DoubleCheckedSingleton instance;

    /**
     * 构造方法私有
     */
    private DoubleCheckedSingleton() {
    }

    /**
     * 通过第一次判断后加锁进行第二次判断来获取DoubleCheckedSingleton对象
     * （适用于多线程）
     * @return DoubleCheckedSingleton对象
     */
    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
