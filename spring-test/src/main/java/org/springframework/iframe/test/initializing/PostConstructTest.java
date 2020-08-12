package org.springframework.iframe.test.initializing;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.beans.initializing.PostConstructBean;
import org.springframework.iframe.beans.initializing.UserBean;

/**
 * @author songsy
 * @date 2020/8/11 16:44
 */
@Slf4j
public class PostConstructTest {

    @Test
    public void test1 () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/initializingBean.xml");
        PostConstructBean postConstructBean = applicationContext.getBean(PostConstructBean.class);
        log.info("" + postConstructBean);
    }

}
