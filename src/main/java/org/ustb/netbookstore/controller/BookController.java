package org.ustb.netbookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.ustb.netbookstore.bean.Book;
import org.ustb.netbookstore.service.BookService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping("bookList")
    public ModelAndView showBooks() {
        List<Book> books = bookService.queryAllBooks();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("BookList");
        modelAndView.addObject("books",books);
        return modelAndView;
    }
    @RequestMapping("add")
    public Book addBook(Book book){
        return bookService.addBook(book);
    }

}
