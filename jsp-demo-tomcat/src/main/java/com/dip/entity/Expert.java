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

    @Column(name = "Country")
    private String country;

    @Column(name = "Description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "experts")
    private Set<DogShow> dogShows;

    @OneToOne(optional = false)
    @JoinColumn(name="human_id", unique = true, nullable = false)
    private Human human;

    public int getExpert_id() {
        return expert_id;
    }

    public void setExpert_id(int expert_id) {
        this.expert_id = expert_id;
    }

    public Set<DogShow> getDogShows() {
        return dogShows;
    }

    public void setDogShows(Set<DogShow> dogShows) {
        this.dogShows = dogShows;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
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
