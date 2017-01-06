package com.annotation.bean;

/**
 * Created by Rain on 2017/1/6.
 */
public class StringStore implements Store {

    public void init() {
        System.out.println("This is init");
    }

    public void destroy() {
        System.out.println("This is destroy");
    }
}
