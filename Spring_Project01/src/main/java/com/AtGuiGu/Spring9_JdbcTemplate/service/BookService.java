package com.AtGuiGu.Spring9_JdbcTemplate.service;

import com.AtGuiGu.Spring9_JdbcTemplate.dao.BookDao;
import com.AtGuiGu.Spring9_JdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/5-14:13
 */

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);

    }

    //修改的方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    //删除的方法
    public void deleteBook(String id){
        bookDao.delete(id);
    }

    //查询表中的记录数
    public int findCount(){
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

    //查询返回对象集合
    public List<Book> findAll(){
        return bookDao.findAll();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeletBook(batchArgs);
    }
}
