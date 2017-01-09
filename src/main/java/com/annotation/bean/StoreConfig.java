package com.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

/**
 * Created by Rain on 2017/1/6.
 */
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {
    @Value("${url}")
    private String url;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager() {
        return new MyDriverManager(url, username, password);
    }

    //设置bean id 和 init destroy方法
//    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
//    public Store getStringStore() {
//        return new StringStore();
//    }

    //scope
//    @Bean(name = "stringStore")
//    @Scope(value = "prototype")
//    public Store stringStore() {
//        return new StringStore();
//    }

    @Autowired
    @Qualifier("stringStore")
    private Store<String> s1;

    @Autowired
    @Qualifier("integerStore")
    private Store<Integer> s2;

    @Bean
    public Store stringStore() {
        return new StringStore();
    }

    @Bean
    public Store integerStore() {
        return new IntegerStore();
    }

    @Bean(name = "stringStoreTest")
    public Store stringStoreTest() {
        System.out.println("s1 : " + s1.getClass().getName());
        System.out.println("s2 : " + s2.getClass().getName());
        return new StringStore();
    }

}
