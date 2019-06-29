package org.springframework.iframe.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @date 2019/6/22 10:01
 */
@Slf4j
@Aspect
@Component
public class ServiceAspectj2 {

    @Pointcut(value = "execution(* org.springframework.iframe.service..*(..))")
    public void pointcut() {

    }
    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        log.info("第二个Aspect");
        Object result = pjp.proceed();
        return result;
    }

}
