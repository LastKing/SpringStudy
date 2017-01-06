package com.annotation.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rain on 2017/1/6.
 */
@Configuration
public class StoreConfig {

    @Bean
    public Store getStringStore() {
        return new StringStore();
    }
}
