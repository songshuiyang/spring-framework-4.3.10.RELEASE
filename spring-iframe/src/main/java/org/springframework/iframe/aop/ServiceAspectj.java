package org.springframework.iframe.aop;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author songshuiyang
 * @date 2019/6/22 10:01
 */
@Slf4j
@Aspect
//@Component
public class ServiceAspectj {

    @Pointcut(value = "execution(* org.springframework.iframe.service..*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        log.info("第一个Aspect");
        String className = pjp.getSignature().getDeclaringType().getSimpleName();
        String methodName = pjp.getSignature().getName();

        log.info("=> [request method: {}#{}]",className, methodName);
        log.info("=> [request body: {}]", JSONObject.toJSONString(pjp.getArgs()));

        Object result = pjp.proceed();

        log.info("=< [response method: {}#{}]",className, methodName);
        log.info("=< [response result: {} ]", JSONObject.toJSONString(result));
        return result;
    }

}
