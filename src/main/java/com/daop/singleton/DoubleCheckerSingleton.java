package com.daop.singleton;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.singleton
 * @Description: 双重锁检查单例模式（适用于多线程）
 * @DATE: 2020-04-26 20:43
 * @AUTHOR: Daop
 **/
public class DoubleCheckerSingleton {
    /**
     * 加volatile关键字防止指令重排序
     */
    private volatile static DoubleCheckerSingleton instance;

    private DoubleCheckerSingleton() {
    }

    public static DoubleCheckerSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckerSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckerSingleton();
                }
            }
        }
        return instance;
    }
}
