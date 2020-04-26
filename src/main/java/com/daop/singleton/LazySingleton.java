package com.daop.singleton;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.singleton
 * @Description: 懒汉式单例
 * @DATE: 2020-04-26 19:57
 * @AUTHOR: Daop
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
