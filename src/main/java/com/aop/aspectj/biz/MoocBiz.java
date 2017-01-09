package com.aop.aspectj.biz;

import org.springframework.stereotype.Service;

/**
 * Created by toonew on 2017/1/9.
 */
@Service
public class MoocBiz {
    @MoocMethod("MoocBiz save MoocMethod")
    public String save(String arg) {
        System.out.println("MoocBiz save" + arg);
//        throw new RuntimeException("save fail");
        return "Save Success";
    }

}
