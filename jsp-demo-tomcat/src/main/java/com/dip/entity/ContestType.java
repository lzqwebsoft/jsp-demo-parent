package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "contest_type")
public class ContestType {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int contest_type_id;

    @Column(name = "Forwhom")
    private String forwhom;

    public int getContest_type_id() {
        return contest_type_id;
    }

    public void setContest_type_id(int contest_type_id) {
        this.contest_type_id = contest_type_id;
    }

    public String getForwhom() {
        return forwhom;
    }

    public void setForwhom(String forwhom) {
        this.forwhom = forwhom;
    }

}
