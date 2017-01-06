package com.annotation.bean;

/**
 * Created by toonew on 2017/1/7.
 */
public class MyDriverManager {

    public MyDriverManager(String url, String username, String password) {
        System.out.println("url ：" + url);
        System.out.println("userName ： " + username);
        System.out.println("password ：" + password);
    }
}
