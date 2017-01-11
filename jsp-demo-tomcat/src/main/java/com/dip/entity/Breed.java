package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "breed")
public class Breed {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int breed_id;

    @Column(name = "Title")
    private String title;

    @Column(name = "fcigroup_id")
    private int fcigroup_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "fcigroup_id", nullable = false, insertable = false, updatable = false)
    private FciGroup fciGroup;


    public int getBreed_id() {
        return breed_id;
    }

    public void setBreed_id(int breed_id) {
        this.breed_id = breed_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFcigroup_id() {
        return fcigroup_id;
    }

    public void setFcigroup_id(int fcigroup_id) {
        this.fcigroup_id = fcigroup_id;
    }

    public FciGroup getFciGroup() {
        return fciGroup;
    }

    public void setFciGroup(FciGroup fciGroup) {
        this.fciGroup = fciGroup;
    }

}
