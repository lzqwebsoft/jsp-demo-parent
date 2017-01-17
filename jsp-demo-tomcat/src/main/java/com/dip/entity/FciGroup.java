package com.dip.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "fcigroup")
public class FciGroup {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int fcigroup_id;

    @Column(name = "Number")
    private int number;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fciGroup")
    private List<Breed> breeds;

    public int getFcigroup_id() {
        return fcigroup_id;
    }

    public void setFcigroup_id(int fcigroup_id) {
        this.fcigroup_id = fcigroup_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Breed> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<Breed> breeds) {
        this.breeds = breeds;
    }
}
