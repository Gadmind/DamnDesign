package com.daop.abstractfactory.bookfactory;

import com.daop.abstractfactory.book.Book;
import com.daop.abstractfactory.book.EnglishBook;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.abstractfactory.bookfactory
 * @Description: 英语书工厂
 * @DATE: 2020-05-02 17:56
 * @AUTHOR: Daop
 **/
public class EnglishFactory implements BookFactory {
    @Override
    public Book printBooks() {
        return new EnglishBook();
    }
}
