package org.springframework.iframe.beans.factory.annotation;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.InjectionMetadata;
import org.springframework.iframe.service.impl.UserServiceImpl;

/**
 * @author songsy
 * @date 2019/6/20 15:43
 */
@Slf4j
public class AutowiredAnnotationBeanPostProcessorTests {


    @Test
    public void test1 () {
        AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor = new AutowiredAnnotationBeanPostProcessor();

        //InjectionMetadata injectionMetadata = autowiredAnnotationBeanPostProcessor.buildAutowiringMetadata(UserServiceImpl.class);

    }
}
