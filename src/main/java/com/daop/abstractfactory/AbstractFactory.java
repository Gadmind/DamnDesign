package com.daop.abstractfactory;

import com.daop.abstractfactory.book.Book;
import com.daop.abstractfactory.book.ChineseBook;
import com.daop.abstractfactory.book.EnglishBook;
import com.daop.abstractfactory.bookfactory.BookFactory;
import com.daop.abstractfactory.bookfactory.ChineseBookFactory;
import com.daop.abstractfactory.bookfactory.EnglishFactory;

/**
 * @BelongsProject: DamnDesign
 * @BelongsPackage: com.daop
 * @Description: 抽象共工厂
 * @DATE: 2020-05-02 18:00
 * @AUTHOR: Daop
 **/
public class AbstractFactory {
    public static void main(String[] args) {
        AbstractFactoryApplication application;
        BookFactory bookFactory;
        String book = "Chinese";
        if (book.contains("English")) {
            bookFactory = new EnglishFactory();
            application = new AbstractFactoryApplication(bookFactory);
        } else {
            bookFactory = new ChineseBookFactory();
            application = new AbstractFactoryApplication(bookFactory);
        }
        application.print();

    }
}

class AbstractFactoryApplication {
    private Book book;

    public AbstractFactoryApplication(BookFactory factory) {
        book = factory.printBooks();
    }

    public void print() {
        book.aboutBook();
    }
}
