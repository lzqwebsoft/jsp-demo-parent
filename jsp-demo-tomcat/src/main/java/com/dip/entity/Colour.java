package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "colour")
public class Colour {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int colour_id;

    @Column(name = "Title")
    private String title;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "colour")
    private Set<Dog> dogs;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "colour")
    private Set<Breed> breeds;

    public Set<Breed> getBreeds() {
        return breeds;
    }

    public void setBreeds(Set<Breed> breeds) {
        this.breeds = breeds;
    }

    public int getColour_id() {
        return colour_id;
    }

    public void setColour_id(int colour_id) {
        this.colour_id = colour_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }
}
