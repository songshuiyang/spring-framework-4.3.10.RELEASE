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

    private final ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans/applicationContext.xml");

    /**
     * 运行时异常事物处理
     *
     * @throws Exception
     */
    @Test
    public void runtimeExceptionTransactionTest() throws Exception {
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        IUser iUser = new IUser();
        iUser.setUsername("运行时异常");
        iUser.setAge(1);
        userService.updateUserByRuntimeException(iUser);
    }

    /**
     * 编译型异常事物处理
     * 事物不回滚
     */
    @Test
    public void compilationExceptionTransactionTest() throws Exception {
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        IUser iUser = new IUser();
        iUser.setUsername("编译型异常 正常不回滚");
        iUser.setAge(1);
        userService.updateUserByCompilationException(iUser);
    }

    /**
     * 编译型异常事物处理
     * 事物回滚
     */
    @Test
    public void updateUserByCompilationExceptionRollback() throws Exception {
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        IUser iUser = new IUser();
        iUser.setUsername("编译型异常 事物回滚");
        iUser.setAge(1);
        userService.updateUserByCompilationExceptionRollback(iUser);
    }

}
