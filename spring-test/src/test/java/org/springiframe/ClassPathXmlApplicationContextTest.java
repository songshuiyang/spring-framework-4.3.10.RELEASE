package org.springiframe;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springiframe.entity.User;
import org.springiframe.service.UserService;

/**
 * @author songsy
 * @date 2019/5/23 11:07
 */
public class ClassPathXmlApplicationContextTest {

    @Test
    public void classPathXmlApplicationContext () {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans/bean.xml");
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        User user = xmlApplicationContext.getBean(User.class);
    }
}
