package com.daop.factory;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.factory
 * @Description: 基础工厂
 * @DATE: 2020-05-02 16:13
 * @AUTHOR: Daop
 **/
public abstract class ProductFactory {

    public void instanceProduct() {
        Product product = creatProduct();
        product.methodOne();
    }

    ;

    /**
     * 创建对象
     *
     * @return
     */
    public abstract Product creatProduct();

}

/**
 * 一号工厂
 */
class OneFactory extends ProductFactory {
    @Override
    public Product creatProduct() {
        Product oneProduct = new ProductOne();
        System.out.println("OneFactory::这是一号工厂创建的");
        oneProduct.methodOne();
        return oneProduct;
    }
}

/**
 * 二号工厂
 */
class TwoFactory extends ProductFactory {
    @Override
    public Product creatProduct() {
        Product productTwo = new ProductTwo();
        System.out.println("TwoFactory::二号工厂");
        productTwo.methodTwo();
        return productTwo;
    }
}


