package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "contest")
public class Contest {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int contest_id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Description")
    private String Description;


    @ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "contest_type_id", nullable = false, insertable = false, updatable = false)
    private Contest_type contest_type;

    @ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "contest_id", nullable = false, insertable = false, updatable = false)
    private DogShow dogShow;


    public DogShow getDogShow() {
        return dogShow;
    }

    public void setDogShow(DogShow dogShow) {
        this.dogShow = dogShow;
    }

    public long getContest_id() {
        return contest_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

//    public int getContest_type_id() {
//        return contest_type_id;
//    }
//
//    public void setContest_type_id(int contest_type_id) {
//        this.contest_type_id = contest_type_id;
//    }

    public void setContest_id(int contest_id) {
        this.contest_id = contest_id;
    }

    public Contest_type getContest_type() {
        return contest_type;
    }

    public void setContest_type(Contest_type contest_type) {
        this.contest_type = contest_type;
    }

}
