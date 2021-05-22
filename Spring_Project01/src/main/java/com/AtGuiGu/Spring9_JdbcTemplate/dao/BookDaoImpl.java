package com.AtGuiGu.Spring9_JdbcTemplate.dao;

import com.AtGuiGu.Spring9_JdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/5-14:14
 */

@Repository(value="bookDapImpl")
public class BookDaoImpl implements BookDao{

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    //添加的方法
    @Override
    public void add(Book book) {
        //1 创建SQL语句
        String sql = "insert into t_book values(?,?,?);";
        //2 调用方法实现
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //修改的方法
    @Override
    public void updateBook(Book book) {
        //1 sql
        String sql = "update t_book set username=?,ustatus=?where user_id=?;";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //删除的方法
    @Override
    public void delete(String id) {
        //1 sql
        String sql = "delete from t_book where user_id=?;";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);

    }

    //查询记录数
    @Override
    public int selectCount() {
        String sql = "select COUNT(*) from t_book;";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    //查询返回对象
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id=?;";
        //调用方法
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //查询返回对象集合
    @Override
    public List<Book> findAll() {
        String sql = "select * from t_book;";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        //遍历集合batchArgs里面的每个Object[]数组
        //将每个数组执行一遍sql里面对应的添加操作
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量修改
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustatus=?where user_id=?;";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量删除
    @Override
    public void batchDeletBook(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
