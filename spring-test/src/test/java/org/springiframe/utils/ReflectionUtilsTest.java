package org.springiframe.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.util.ReflectionUtils;
import org.springiframe.entity.User;

import java.lang.reflect.Field;

/**
 * @author songsy
 * @date 2019/6/6 11:05
 * @see ReflectionUtils
 */
@Slf4j
public class ReflectionUtilsTest {

    @Test
    public void test1 () {
        Class aClass = User.class;
        Field field =  ReflectionUtils.findField(aClass, "userName");
    }
}
