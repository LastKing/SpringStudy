package com.annotation.autowired2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Rain on 2017/1/6.
 */
@Order(value = 1)
@Component
public class BeanImplTwo implements BeanInterface {
}
