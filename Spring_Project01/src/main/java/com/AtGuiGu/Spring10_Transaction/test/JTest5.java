package com.AtGuiGu.Spring10_Transaction.test;

import com.AtGuiGu.Spring10_Transaction.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/6-14:56
 */

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean15_Transaction.xml")

@SpringJUnitConfig(locations="classpath:bean15_Transaction.xml")
public class JTest5 {
    @Autowired
    @Qualifier()
    private UserService userService;

    @Test
    public void test1(){
        userService.transfer();
    }
}
