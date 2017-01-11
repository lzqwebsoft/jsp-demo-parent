package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "breeder")
public class Breeder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int breeder_id;

    @Column(name = "Fname")
    private String fname;

    @Column(name = "Sname")
    private String sname;

    @Column(name = "Lname")
    private String lname;

    public int getBreeder_id() {
        return breeder_id;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "breeder_id", nullable = false, insertable = false, updatable = false)
    private Dog dog;

    public void setBreeder_id(int breeder_id) {
        this.breeder_id = breeder_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
