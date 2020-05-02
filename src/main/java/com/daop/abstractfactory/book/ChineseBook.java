package com.daop.abstractfactory.book;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.abstractfactory
 * @Description: 语文书
 * @DATE: 2020-05-02 17:52
 * @AUTHOR: Daop
 **/
public class ChineseBook implements Book {

    @Override
    public void aboutBook() {
        System.out.println("This bool is ChineseBook!!!!");
    }
}
