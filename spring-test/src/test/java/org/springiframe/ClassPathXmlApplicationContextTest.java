package org.springiframe;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springiframe.entity.User;

/**
 * @author songsy
 * @date 2019/5/23 11:07
 */
public class ClassPathXmlApplicationContextTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans/bean.xml");
        User user = xmlApplicationContext.getBean(User.class);
    }
}
