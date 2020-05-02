package com.daop.factory;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.factorymethod
 * @Description: 工厂方法模式
 * @DATE: 2020-05-02 14:46
 * @AUTHOR: Daop
 **/
public class FactoryMethod {
    public static ProductFactory productFactory;

    public static void main(String[] args) {
        String type = "One";
        if (type.equals("One")) {
            productFactory = new OneFactory();
        } else if ("Two".equals(type)) {
            productFactory = new TwoFactory();
        }
        productFactory.creatProduct();
    }
}