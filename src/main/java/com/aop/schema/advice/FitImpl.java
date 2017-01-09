package com.aop.schema.advice;

/**
 * Created by Rain on 2017/1/9.
 */
public class FitImpl implements Fit {

    @Override
    public void filter() {
        System.out.println("FitImpl filter");
    }
}
