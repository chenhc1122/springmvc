package com.yqz.dao;

import com.yqz.pojo.Books;

import java.util.List;

public interface BookMapper {
//    增加一本书
    int addBooks(Books books);
//    删除一本书
    int deleteBookById( int bookID);
//    更新一本书
    int updateBook(Books books);
//    查询一本书
    Books selectById(int bookID);
//    查询全部的书
    List<Books> selectAllBooks();
}
