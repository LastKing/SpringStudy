package com.ltx.test2;

import com.ltx.test2.OneInterface;
import com.ltx.test2.OneInterfaceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * houhou
 * Created by Rain on 2017/1/5.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationContext context2 = new FileSystemXmlApplicationContext("beans.xml");

        OneInterface oif = context.getBean("oneInterface", OneInterface.class);
        System.out.printf(oif.hello("我的的输入"));

//        OneInterface oif = new OneInterfaceImpl();
//        System.out.printf(oif.hello("word."));
    }
}
