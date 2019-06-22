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
public class Aspectj {


    @Pointcut(value = "execution(* org.springframework.iframe.service..*(..))")
    //@Pointcut(value = "execution (* *.*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        String className = pjp.getSignature().getDeclaringType().getSimpleName();
        String methodName = pjp.getSignature().getName();
        log.info("{}#{}方法开始执行", className, methodName);
        Object result = pjp.proceed();
        log.info("{}#{}方法结束执行", className, methodName);
        return result;
    }

}
