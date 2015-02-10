package com.dhy.study.jpatest.mapping.one2one.dao.impl;

import com.dhy.study.jpatest.entities.Employ;
import com.dhy.study.jpatest.mapping.one2one.dao.EmployDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 * Created by Administrator on 2015/2/10.
 */
@Repository
@Transactional
public class EmployDaoImpl implements EmployDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Employ findByName(String name) {
        TypedQuery<Employ> query = entityManager.createQuery("select e from Employ  e where e.name = :name", Employ.class);
        query.setParameter("name",name);
        Employ e = query.getSingleResult();
        return e;
    }

    @Override
    public Employ save(Employ e) {
        entityManager.persist(e);
        return e;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
