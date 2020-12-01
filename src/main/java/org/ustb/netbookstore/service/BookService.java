package org.ustb.netbookstore.service;

import org.ustb.netbookstore.bean.Book;

import java.util.List;

public interface BookService {
    public Book addBook(Book book);
    //查询所有书籍
    List<Book> queryAllBooks();
}
