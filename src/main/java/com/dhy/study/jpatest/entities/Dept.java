package com.dhy.study.jpatest.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Administrator on 2015/2/10.
 */
@Entity
public class Dept {
    private long id;
    private String name;

    private Collection<Employ> employs;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "dept")
    public Collection<Employ> getEmploys() {
        return employs;
    }

    public void setEmploys(Collection<Employ> employs) {
        this.employs = employs;
    }
}
