package com.AtGuiGu.Spring9_JdbcTemplate.dao;

import com.AtGuiGu.Spring9_JdbcTemplate.entity.Book;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/5-14:14
 */

public interface BookDao {
    //添加的方法
    void add(Book book);

    //修改
    void updateBook(Book book);

    //删除
    void delete(String id);

    //查询表中的记录数
    int selectCount();

    //查询返回对象
    Book findBookInfo(String id);

    //查询返回对象集合
    List<Book> findAll();

    //批量添加
    void batchAddBook(List<Object[]> batchArgs);

    //批量修改
    void batchUpdateBook(List<Object[]> batchArgs);

    //批量删除
    void batchDeletBook(List<Object[]> batchArgs);
}
