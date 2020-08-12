package org.springframework.iframe.test.initializing;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.beans.initializing.UserBean;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.service.UserService;

/**
 * @author songsy
 * @date 2020/8/11 16:27
 */
@Slf4j
public class InitializingBeanTest {

    @Test
    public void test1 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/initializingBean.xml");
        UserBean userBean = applicationContext.getBean(UserBean.class);
        log.info("" + userBean);
    }
}
