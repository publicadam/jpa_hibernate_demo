package com.dhy.study.jpatest.entities;

import javax.persistence.*;

/**
 * Created by Administrator on 2015/2/10.
 */
@Entity
public class ParkingSpace {
    private int id;
    private int lot;
    private String location;

    private Employ employ;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @OneToOne(mappedBy = "parkingSpace")
    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }
}
