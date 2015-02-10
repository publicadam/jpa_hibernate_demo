package com.dhy.study.jpatest.mapping.one2one.dao.impl;

import com.dhy.study.jpatest.entities.Dept;
import com.dhy.study.jpatest.entities.Employ;
import com.dhy.study.jpatest.entities.ParkingSpace;
import com.dhy.study.jpatest.mapping.one2one.dao.EmployDao;
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
        e.setComments("级联测试");
        e.setSalary(12000);

        Dept dept = new Dept();
        dept.setName("IT");

        ParkingSpace space = new ParkingSpace();
        space.setLocation("tianjin road");
        space.setLot(15);

        e.setDept(dept);
        e.setParkingSpace(space);
        employDao.save(e);
        System.out.println(e.getId());
    }
}