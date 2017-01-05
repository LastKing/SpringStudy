package com.ltx.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Rain on 2017/1/5.
 */
public class MoocApplicationContext implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("moocApplicationContext : " + applicationContext.getBean("moocApplicationContext"));
    }

}
