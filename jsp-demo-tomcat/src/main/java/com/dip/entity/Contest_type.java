package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "contest_type")
public class Contest_type {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int contest_type_id;

    @Column(name = "Forwhom")
    private String forwhom;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "contest_type_id", nullable = false, insertable = false, updatable = false)
    private Contest contest;

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

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }
}
