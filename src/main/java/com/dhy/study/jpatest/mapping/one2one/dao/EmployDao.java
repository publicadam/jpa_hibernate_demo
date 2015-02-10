package com.dhy.study.jpatest.mapping.one2one.dao;

import com.dhy.study.jpatest.mapping.one2one.entities.Employ;

/**
 * Created by Administrator on 2015/2/9.
 */
public interface EmployDao {
    public Employ findByName(String name);
    public Employ save(Employ e);
}
