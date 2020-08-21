package org.springframework.iframe.test.transaction;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.test.transaction.v1.UserService;

/**
 * @author songsy
 * @date 2020/8/21 15:43
 */
@Slf4j
public class UserServiceTest {

    private final ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans/applicationContext.xml");

    @Test
    public void test1() throws Exception {
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        userService.insertAll();
    }


}
