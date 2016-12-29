package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

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
    private int forWhom;                        // 1 - dog;      2 - people

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "contest_type")
    private Set<Contest> contests;

    public long getContest_type_id() {
        return contest_type_id;
    }

    public void setContest_type_id(Integer contest_type_id) {
        this.contest_type_id = contest_type_id;
    }

    public void setContest_type_id(int contest_type_id) {
        this.contest_type_id = contest_type_id;
    }

    public int getForWhom() {
        return forWhom;
    }

    public void setForWhom(int forWhom) {
        this.forWhom = forWhom;
    }

    public Set<Contest> getContests() {
        return contests;
    }

    public void setContests(Set<Contest> contests) {
        this.contests = contests;
    }
}

