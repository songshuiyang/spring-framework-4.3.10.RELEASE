package org.springframework.iframe.test.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.entity.User;
import org.springframework.iframe.service.UserService;

/**
 * @author songshuiyang
 * @date 2019/6/22 10:50
 */
@Slf4j
public class AspectTests {

    @Test
    public void test1 () {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans/bean.xml");
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        User user1 = userService.findUserByName("sd");
        log.info("user1:{}", user1);
    }

}
