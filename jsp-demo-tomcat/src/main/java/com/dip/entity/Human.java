package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 24.01.2017.
 */
@Entity
@Table(name = "human")
public class Human {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int human_id;

    @Column(name = "Fname")
    private String Fname;

    @Column(name = "Sname")
    private String Sname;

    @Column(name = "Lname")
    private String Lname;

    public int getHuman_id() {
        return human_id;
    }

    public void setHuman_id(int human_id) {
        this.human_id = human_id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }
}
