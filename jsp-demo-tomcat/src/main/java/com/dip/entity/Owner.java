package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "owner")
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int owner_id;

    @OneToOne(optional = false)
    @JoinColumn(name="human_id", unique = true, nullable = false)
    private Human human;

    @Column(name = "Location")
    private String location;

    @OneToOne(optional = false)
    @JoinColumn(name = "coOwner1_id", unique = true, nullable = false)
    private CoOwner1 coOwner1;

    @OneToOne(optional = false)
    @JoinColumn(name = "coOwner2_id", unique = true, nullable = false)
    private CoOwner2 coOwner2;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner")
    private Set<Dog> dogs;

    public CoOwner1 getCoOwner1() {
        return coOwner1;
    }

    public void setCoOwner1(CoOwner1 coOwner1) {
        this.coOwner1 = coOwner1;
    }

    public CoOwner2 getCoOwner2() {
        return coOwner2;
    }

    public void setCoOwner2(CoOwner2 coOwner2) {
        this.coOwner2 = coOwner2;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
