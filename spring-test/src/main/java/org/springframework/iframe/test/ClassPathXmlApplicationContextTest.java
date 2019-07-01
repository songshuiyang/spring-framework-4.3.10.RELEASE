package org.springframework.iframe.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.service.UserService;

/**
 * @author songsy
 * @date 2019/5/23 11:07
 */
@Slf4j
public class ClassPathXmlApplicationContextTest {

    @Test
    public void classPathXmlApplicationContext () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/bean.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        IUser IUser1 = userService.findUserByName("sd");
        log.info("IUser1:{}", IUser1);
        IUser IUser2 = applicationContext.getBean(IUser.class);
    }
}
