package com.daop.singleton;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.singleton
 * @Description: 通过枚举方式获取单例
 * @DATE: 2020-04-26 20:18
 * @AUTHOR: Daop
 **/
public enum SingletonEnum {
    INSTANCE;

    public static SingletonEnum getInstance() {
        return SingletonEnum.INSTANCE;
    }
}
