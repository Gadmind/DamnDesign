package com.daop.abstractfactory.book;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.abstractfactory
 * @Description: 英语书
 * @DATE: 2020-05-02 17:51
 * @AUTHOR: Daop
 **/
public class EnglishBook implements Book {

    @Override
    public void aboutBook() {
        System.out.println("This book is EnglishBook!!!!!");
    }
}
