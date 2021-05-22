package com.AtGuiGu.Spring10_Transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/6-9:25
 */
@Repository
public class UserDaoImpl implements UserDao{
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //lucy --> 100 mary
    //多钱
    @Override
    public void addMoney() {
        String sql = "update t_account set money=money-? where username=?;";
        jdbcTemplate.update(sql, 100,"lucy");
    }

    //多钱
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money+? where username=?;";
        jdbcTemplate.update(sql, 100, "mary");

    }
}
