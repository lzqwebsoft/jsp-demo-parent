package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "owner")
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int owner_id;

    @Column(name = "Fname")
    private String fname;

    @Column(name = "Sname")
    private String sname;

    @Column(name = "Lname")
    private String Lname;

    @Column(name = "Location")
    private String location;

    public int getOwner_id() {
        return owner_id;
    }


    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
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
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
