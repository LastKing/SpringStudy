package com.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rain on 2017/1/5.
 */
@Service
public class InjectionServiceImpl implements InjectionService {

    @Autowired
    private InjectionDao injectionDao;

    //构造器注入
    @Autowired
    public InjectionServiceImpl(InjectionDao injectionDao) {
        System.out.println("构造器的方式");
        this.injectionDao = injectionDao;
    }

    //
    //设值注入
    @Autowired
    public void setInjectionDao(InjectionDao injectionDao) {
        System.out.println("setter 方式");
        this.injectionDao = injectionDao;
    }

    @Override
    public void save(String arg) {
        System.out.println("service 接受得到的数据" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDao.save(arg);
    }

    public void start() {
        System.out.println("injectionService 开始");
    }

    public void stop() {
        System.out.println("injectionService 结束");
    }
}
