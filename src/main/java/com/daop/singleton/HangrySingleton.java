package com.daop.singleton;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.singleton
 * @Description: 饿汉式单例
 * @DATE: 2020-04-26 20:05
 * @AUTHOR: Daop
 **/
public class HangrySingleton {
    public static HangrySingleton instance=new HangrySingleton();
    private HangrySingleton(){}
    public static HangrySingleton getInstance(){
        return instance;
    }
}