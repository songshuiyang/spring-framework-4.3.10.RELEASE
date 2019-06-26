package org.springframework.iframe.test.transaction;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.service.UserService;

/**
 * @author songshuiyang
 * @date 2019/6/22 10:50
 */
@Slf4j
public class TransactionTests {

    @Test
    public void test1 () {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans/applicationContext.xml");
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        IUser iUser = new IUser();
        iUser.setUsername("20190626");
        iUser.setAge(1);
        userService.updateUser(iUser);
    }

}
