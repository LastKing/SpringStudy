package com.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

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

//    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
//    public Store getStringStore() {
//        return new StringStore();
//    }
}
