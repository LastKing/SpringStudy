package com.annotation.jsr;

import org.springframework.stereotype.Repository;

/**
 * Created by Rain on 2017/1/9.
 */
@Repository
public class JsrDao {

    public void save() {
        System.out.println("jsr DAO");
    }

}
