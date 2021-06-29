package com.yqz.service;

import com.yqz.dao.BookMapper;
import com.yqz.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{
    //service调用dao层，组合dao
   private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBooks(Books books) {
        return bookMapper.addBooks(books);
    }

    @Override
    public int deleteBookById(int bookID) {
        return bookMapper.deleteBookById(bookID);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books selectById(int bookID) {
        return bookMapper.selectById(bookID);
    }

    @Override
    public List<Books> selectAllBooks() {
        return bookMapper.selectAllBooks();
    }
}
