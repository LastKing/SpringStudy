package com.ltx.test2;

/**
 * Created by Rain on 2017/1/5.
 */
public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String word) {
        return "Word from interface\"OneInterface\" :" + word;
    }

}
