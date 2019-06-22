package org.springframework.iframe.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.entity.User;
import org.springframework.iframe.service.UserService;

/**
 * @author songsy
 * @date 2019/5/23 11:07
 */
@Slf4j
public class ClassPathXmlApplicationContextTest {

    @Test
    public void classPathXmlApplicationContext () {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans/bean.xml");
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        User user1 = userService.findUserByName("sd");
        log.info("user1:{}", user1);
        User user2 = xmlApplicationContext.getBean(User.class);
    }
}
