package com.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Rain on 2017/1/9.
 */
public class MoocAspect {

    public void before() {
        System.out.println("MoocAspect before");
    }

    public void afterReturning() {
        System.out.println("MoocAspect afterReturning");
    }

    public void afterThrowing() {
        System.out.println("MoocAspect afterThrowing");
    }

    public void after() {
        System.out.println("MoocAspect after");
    }

    public void around(ProceedingJoinPoint pjp) {
        try {
            System.out.println("MoocAspect around1");
            Object obj = pjp.proceed();
            System.out.println("MoocAspect around2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) {
        System.out.println("Around init : " + bizName + " " + times);
        Object obj = null;
        try {
            System.out.println("MoocAspect around1");
            obj = pjp.proceed();
            System.out.println("MoocAspect around2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }


}
