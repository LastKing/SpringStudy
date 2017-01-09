package com.aop.schema.advice.biz;

/**
 * Created by Rain on 2017/1/9.
 */
public class AspectBiz {

    public void biz() {
        System.out.println("AspectBiz biz");

//        throw new RuntimeException();
    }

    public void init(String bizName, int times) {
        System.out.println("AspectBiz init : " + bizName + " " + times);
    }

}
