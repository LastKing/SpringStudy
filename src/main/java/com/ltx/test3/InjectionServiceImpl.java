package com.ltx.test3;

/**
 * Created by Rain on 2017/1/5.
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    //构造器注入
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    //    // 设值注入
    public void setInjectionDao(InjectionDao injectionDao) {
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
