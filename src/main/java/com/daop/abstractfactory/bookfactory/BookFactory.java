package com.daop.abstractfactory.bookfactory;

import com.daop.abstractfactory.book.Book;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop.abstractfactory.bookfactory
 * @Description: 书本工厂
 * @DATE: 2020-05-02 17:53
 * @AUTHOR: Daop
 **/
public interface BookFactory {
    /**
     * 印书
     * @return
     */
    Book printBooks();
}
