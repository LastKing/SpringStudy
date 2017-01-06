package com.annotation.test1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Rain on 2017/1/6.
 */
//@Component
@Component("bean")
@Scope(value = "prototype")
public class BeanAnnotation {

    public void say(String arg) {
        System.out.println("BeanAnnotation" + arg);
    }

    public void myHash() {
        System.out.println("BeanAnnotation : " + this.hashCode());
    }

}
