package com.daop.factory;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.factory
 * @Description: 物品通用接口
 * @DATE: 2020-05-02 16:03
 * @AUTHOR: Daop
 **/
public interface Product {
    /**
     *方法一
     */
    void methodOne();

    /**
     *方法二
     */
    void methodTwo();
}

/**
 * 一号物品
 */
class ProductOne implements Product{

    @Override
    public void methodOne() {
        System.out.println("One::这是一号方法的实现");
        methodTwo();
    }

    @Override
    public void methodTwo() {
        System.out.println("One::这是二号方法的实现");

    }
}

/**
 * 二号物品
 */
class ProductTwo implements Product{

    @Override
    public void methodOne() {
        System.out.println("Two::这是一号方法的实现");
        methodTwo();
    }

    @Override
    public void methodTwo() {
        System.out.println("Two::这是二号方法的实现");

    }
}
