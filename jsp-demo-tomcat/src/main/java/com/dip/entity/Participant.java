package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 05.01.2017.
 */
@Entity
@Table(name = "participant")
public class Participant {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int participant_id;

    @Column(name = "Fname")
    private String fname;

    @Column(name = "Sname")
    private String sname;

    @Column(name = "Lname")
    private String lname;

    @Column(name = "Age")
    private int age;

    public int getParticipant_id() {
        return participant_id;
    }

    public void setParticipant_id(int participant_id) {
        this.participant_id = participant_id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
