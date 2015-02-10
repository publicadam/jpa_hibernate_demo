package com.dhy.study.jpatest.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Administrator on 2015/2/10.
 */
@Entity
public class Employ {
    private int id;
    private String name;
    private long salary;
    private String comments;

    private Dept dept;
    private ParkingSpace parkingSpace;
    private Collection<Phone> phones;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @ManyToOne
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @OneToOne
    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    @OneToMany
    @JoinTable(name="emp_phone",joinColumns = @JoinColumn(name="emp_id"),inverseJoinColumns = @JoinColumn(name="phone_id"))
    public Collection<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Collection<Phone> phones) {
        this.phones = phones;
    }
}
