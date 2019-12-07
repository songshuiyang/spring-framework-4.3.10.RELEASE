package org.springframework.iframe.spring.core;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @author songsy
 * @date 2019/12/7 14:14
 */
public class PathMatchingResourcePatternResolverTests {


    @Test
    public void test0() throws Exception {
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        Resource [] resources = patternResolver.getResources("");

    }

    @Test
    public void test1() throws Exception {
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        Resource [] resources = patternResolver.getResources("classpath*:mybatis-config.xml");

    }

}
