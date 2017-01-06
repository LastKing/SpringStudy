package com.annotation.autowired;

import org.springframework.stereotype.Repository;

/**
 * Created by Rain on 2017/1/5.
 */
@Repository
public class InjectDaoImpl implements InjectionDao {
    @Override
    public void save(String arg) {
        System.out.println("Dao保存的数据" + arg);
    }
}
