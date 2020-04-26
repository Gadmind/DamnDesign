package com.daop.singleton;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.singleton
 * @Description: 静态内部类单例(懒加载、多线程也可以)
 * @DATE: 2020-04-26 20:09
 * @AUTHOR: Daop
 **/
public class InnerClassSingleton {
    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }
}
