package com.annotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Rain on 2017/1/9.
 */
//@Service
@Named
public class JsrService {
    //    @Resource
    @Inject
    private JsrDao jsrDao;

    @PostConstruct
    public void init() {
        System.out.println("jsrService init");
    }

    @PreDestroy
    public void detory() {
        System.out.println("jsrService destroy");
    }

    public void save() {
        jsrDao.save();
    }
}
