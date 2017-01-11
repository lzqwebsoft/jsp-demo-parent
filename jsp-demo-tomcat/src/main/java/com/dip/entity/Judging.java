package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 07.01.2017.
 */
@Entity
@Table(name = "judging")
public class Judging {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int judging_id;

    @Column(name = "Ring")
    private int ring;

    @OneToOne(optional = false)
    @JoinColumn(name = "expert_id", unique = true, nullable = false)
    private Expert expert;

    @OneToOne(optional = false)
    @JoinColumn(name = "dogshow_id", unique = true, nullable = false)
    private DogShow dogShow;

    public int getJudging_id() {
        return judging_id;
    }

    public void setJudging_id(int judging_id) {
        this.judging_id = judging_id;
    }

    public int getRing() {
        return ring;
    }

    public void setRing(int ring) {
        this.ring = ring;
    }

    public Expert getExpert() {
        return expert;
    }

    public void setExpert(Expert expert) {
        this.expert = expert;
    }

    public DogShow getDogShow() {
        return dogShow;
    }

    public void setDogShow(DogShow dogShow) {
        this.dogShow = dogShow;
    }
}
