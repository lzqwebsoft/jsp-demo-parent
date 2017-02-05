package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "breeder")
public class Breeder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int breeder_id;

    @Column(name = "Location")
    private String location;

    public int getBreeder_id() {
        return breeder_id;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "breeder")
    private Set<Dog> dogs;

    @OneToOne(optional = false)
    @JoinColumn(name="human_id", unique = true, nullable = false)
    private Human human;

    public void setBreeder_id(int breeder_id) {
        this.breeder_id = breeder_id;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
