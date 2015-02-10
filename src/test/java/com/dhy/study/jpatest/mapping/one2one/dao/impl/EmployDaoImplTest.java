package com.dhy.study.jpatest.mapping.one2one.dao.impl;

import com.dhy.study.jpatest.mapping.one2one.dao.EmployDao;
import com.dhy.study.jpatest.mapping.one2one.entities.Employ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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