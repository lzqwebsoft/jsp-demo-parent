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

    @Column(name = "contest_type_id")
    private int contest_type_id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Description")
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contest")
    private Set<Contest_type> contest_types;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "contest_id", nullable = false, insertable = false, updatable = false)
    private DogShow dogShow;

    public int getContest_id() {
        return contest_id;
    }

    public void setContest_id(int contest_id) {
        this.contest_id = contest_id;
    }

    public int getContest_type_id() {
        return contest_type_id;
    }

    public void setContest_type_id(int contest_type_id) {
        this.contest_type_id = contest_type_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Contest_type> getContest_types() {
        return contest_types;
    }

    public void setContest_types(Set<Contest_type> contest_types) {
        this.contest_types = contest_types;
    }
}
