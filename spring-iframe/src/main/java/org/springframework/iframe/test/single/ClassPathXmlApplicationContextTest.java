package org.springframework.iframe.test.single;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.service.UserService;
import org.springframework.iframe.single.A;

/**
 * @author songsy
 * @date 2019/5/23 11:07
 */
@Slf4j
public class ClassPathXmlApplicationContextTest {

    @Test
    public void classPathXmlApplicationContext () {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/bean1.xml");
        A a1 = applicationContext.getBean(A.class);
        A a2 = applicationContext.getBean(A.class);

    }
}
