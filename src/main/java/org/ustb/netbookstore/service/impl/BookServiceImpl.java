package org.ustb.netbookstore.service.impl;

import org.springframework.stereotype.Service;
import org.ustb.netbookstore.bean.Book;
import org.ustb.netbookstore.mapper.IBookMapper;
import org.ustb.netbookstore.service.BookService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    //添加书籍
    @Resource
    private IBookMapper iBookMapper;
    @Override
    public Book addBook(Book book){
        int result=iBookMapper.insert(book);
        if(result>0){
            return iBookMapper.selectById(book.getBid());
        }
        return null;
    }

    @Override
    public List<Book> queryAllBooks() {
        return iBookMapper.selectList(null);
    }
}
