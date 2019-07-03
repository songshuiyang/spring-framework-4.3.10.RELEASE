package org.springframework.iframe.test.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.iframe.entity.IUser;
import org.springframework.iframe.mapper.UserMapper;

/**
 * @author songshuiyang
 * @date 2019/6/22 10:50
 */
@Slf4j
public class MybatisTests {

    @Test
    public void test1 () {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        SqlSessionTemplate sqlSessionTemplate = xmlApplicationContext.getBean(SqlSessionTemplate.class);
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        IUser iUser = userMapper.selectByPrimaryKey(1);
        log.info(iUser.toString());
    }

}
