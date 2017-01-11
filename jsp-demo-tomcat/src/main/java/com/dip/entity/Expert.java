package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by moneg on 07.01.2017.
 */
@Entity
@Table(name = "expert")
public class Expert {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int expert_id;

    @Column(name = "Fname")
    private String fname;

    @Column(name = "Sname")
    private String sname;

    @Column(name = "Lname")
    private String lname;

    @Column(name = "Country")
    private String country;

    @Column(name = "Description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "experts")
    private Set<DogShow> dogShows;

    public int getExpert_id() {
        return expert_id;
    }

    public void setExpert_id(int expert_id) {
        this.expert_id = expert_id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
