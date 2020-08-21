package org.springframework.iframe.test.transaction;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.test.transaction.v1.*;

/**
 * @author songsy
 * @date 2020/8/21 10:16
 */
@Slf4j
public class UserRequiredServiceTest {

    private final ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans/applicationContext.xml");

    @Test
    public void test1() throws Exception {
        UserRequiredService userRequiredService = xmlApplicationContext.getBean(UserRequiredService.class);
        userRequiredService.insertAll();
    }



    @Test
    public void test2() throws Exception {
        UserRequiresNewService userService = xmlApplicationContext.getBean(UserRequiresNewService.class);
        userService.insertAll();
    }

    @Test
    public void test3() throws Exception {
        UserRequiresNestedService userService = xmlApplicationContext.getBean(UserRequiresNestedService.class);
        userService.insertAll();
    }

    @Test
    public void test4() throws Exception {
        UserRequiresNestedService userService = xmlApplicationContext.getBean(UserRequiresNestedService.class);
        userService.insertAll1();
    }

    @Test
    public void test5() throws Exception {
        UserRequiresNeverService userService = xmlApplicationContext.getBean(UserRequiresNeverService.class);
        userService.insertAll();
    }


    @Test
    public void test6() throws Exception {
        UserRequiresMandatoryService userService = xmlApplicationContext.getBean(UserRequiresMandatoryService.class);
        userService.insertAll();
    }

    @Test
    public void test7() throws Exception {
        UserRequiresSupportsService userService = xmlApplicationContext.getBean(UserRequiresSupportsService.class);
        userService.insertAll();
    }

    @Test
    public void test8() throws Exception {
        UserRequiresNotSupportsService userService = xmlApplicationContext.getBean(UserRequiresNotSupportsService.class);
        userService.insertAll();
    }
}
