package com.aop.aspectj;

import com.aop.aspectj.biz.MoocMethod;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by toonew on 2017/1/9.
 */
@Component
@Aspect
public class MoocAspect {

    @Pointcut("execution(* com.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut() {
    }

    @Pointcut("within(com.aop.aspectj.biz.*)")
    public void bizPointCut() {

    }

    //    @Before("(execution(* com.aop.aspectj.biz.*Biz.*(..)))")
    @Before("pointcut()")
    public void before() {
        System.out.println("Before");
    }

    @Before("pointcut()&&args(arg)")
    public void beforeWithParam(String arg) {
        System.out.println("beforeWithParam : " + arg);
    }

    @Before("pointcut()&&@annotation(moocMethod)")
    public void beforeWithAnnotation(MoocMethod moocMethod) {
        System.out.println("beforeWithAnnotation : " + moocMethod.value());
    }

    @AfterReturning(pointcut = "bizPointCut()", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("afterReturning : " + returnValue);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void afterThrowing(RuntimeException e) {
        System.out.println("AfterThrowing : " + e.getMessage());
    }

    @After("pointcut()")
    public void after() {
        System.out.println("After.");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around1.");
        Object obj = pjp.proceed();
        System.out.println("Around2.");
        System.out.println("Around : " + obj);
        return obj;
    }


}
