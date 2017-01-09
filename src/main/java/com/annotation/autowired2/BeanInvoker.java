package com.annotation.autowired2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Rain on 2017/1/6.
 */
@Component
public class BeanInvoker {
    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    //    @Autowired
//    @Qualifier("beanImplOne")
    private BeanInterface beanInterface;

    @Autowired
    public void setBeanInterface(@Qualifier("beanImplOne") BeanInterface beanInterface) {
        this.beanInterface = beanInterface;
    }

    public void say() {
        if (null != list) {
            for (BeanInterface bean : list) {
                System.out.println(bean.getClass().getName());
            }
        } else {
            System.out.println("List<BeanInterface> is null");
        }

        if (null != map && 0 != map.size()) {
            for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "   " + entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("Map<String, BeanInterface> is null");
        }

        if (null != beanInterface) {
            System.out.println("beanInferInterFace impl : " + beanInterface.getClass().getName());
        } else {
            System.out.println("beanInterface is null");
        }
    }

}
