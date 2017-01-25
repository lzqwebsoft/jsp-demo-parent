package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "breeder")
public class Breeder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int breeder_id;

    public int getBreeder_id() {
        return breeder_id;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "breeder_id", nullable = false, insertable = false, updatable = false)
    private Dog dog;

    @OneToOne(optional = false)
    @JoinColumn(name="human_id", unique = true, nullable = false)
    private Human human;

    public void setBreeder_id(int breeder_id) {
        this.breeder_id = breeder_id;
    }


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
