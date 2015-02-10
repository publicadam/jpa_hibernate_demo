package com.dhy.study.jpatest.dao.impl;

import com.dhy.study.jpatest.dao.EmployDao;
import com.dhy.study.jpatest.entities.Employ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployDaoImplTest {
    @Autowired
    private EmployDao employDao;

    @Test
    public void testFindByName() throws Exception {
        Employ e = employDao.findByName("adam");
        System.out.println(e);
    }

    @Test
    public void testAddEmploy(){
        Employ e = new Employ();
        e.setName("adam");
        e.setAge(27);
        employDao.save(e);
        System.out.println(e.getId());
    }
}