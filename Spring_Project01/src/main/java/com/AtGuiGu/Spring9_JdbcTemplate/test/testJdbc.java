package com.AtGuiGu.Spring9_JdbcTemplate.test;

import com.AtGuiGu.Spring9_JdbcTemplate.Config.JdbcConfig;
import com.AtGuiGu.Spring9_JdbcTemplate.dao.BookDaoImpl;
import com.AtGuiGu.Spring9_JdbcTemplate.entity.Book;
import com.AtGuiGu.Spring9_JdbcTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/5-14:48
 */

public class testJdbc {

    @Test
    public void testJdbcTemplateAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean14_Jdbc_Template.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        //添加
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java_update");
//        book.setUstatus("aa");
//        bookService.updateBook(book);

        //删除
//        bookService.deleteBook("1");

        //查询返回某个值
//        int count = bookService.findCount();
//        System.out.println(count);

        //查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);

        //查询返回对象集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3", "java3", "c"};
//        Object[] o2 = {"4", "C++", "d"};
//        Object[] o3 = {"5", "javaScript", "e"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        //需要修改参数顺序 按照sql的顺序来
//        Object[] o1 = {"java33333", "c", "3"};
//        Object[] o2 = {"C++4444", "d", "4"};
//        Object[] o3 = {"javaScript5555", "e", "5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        //需要修改参数顺序 按照sql的顺序来
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }
}
