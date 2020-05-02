package com.daop.abstractfactory.bookfactory;

import com.daop.abstractfactory.book.Book;
import com.daop.abstractfactory.book.ChineseBook;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.abstractfactory.bookfactory
 * @Description: 数学书工厂
 * @DATE: 2020-05-02 17:55
 * @AUTHOR: Daop
 **/
public class ChineseBookFactory implements BookFactory {
    @Override
    public Book printBooks() {
        return new ChineseBook();
    }
}
