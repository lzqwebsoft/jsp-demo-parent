package com.dip.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "dog")
public class Dog {

    @Id
    @Column(name = "Pedigree")
    private String pedigree;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Name")
    private String name;

    @Column(name = "Dob")
    private Date dob;

    @Column(name = "ChipMark")
    private String chipMark;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "owner_id", nullable = false, insertable = false, updatable = false)
    private Owner owner;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name="breed_id", unique = true, nullable = false,insertable = false,updatable = false)
    private Breed breed;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "breeder_id", unique = true, nullable = false, insertable = false,updatable = false)
    private Breeder breeder;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name="colour_id", unique = true, nullable = false,insertable = false,updatable = false)
    private Colour colour;

    @ManyToMany
    @JoinTable(name="parents",
            joinColumns = @JoinColumn(name="pedigree", referencedColumnName="pedigree"),
            inverseJoinColumns = @JoinColumn(name="ancestry_id", referencedColumnName="ancestry_id")
    )
    private Set<Ancestry> ancestries;

    public Set<Ancestry> getAncestries() {
        return ancestries;
    }

    public void setAncestries(Set<Ancestry> ancestries) {
        this.ancestries = ancestries;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "dogs")
    private Set<DogShow> dogShows;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "dogs")
    private Set<Contest> contests;

    public Colour getColour() {
        return colour;
    }

    public String getChipMark() {
        return chipMark;
    }

    public void setChipMark(String chipMark) {
        this.chipMark = chipMark;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Set<DogShow> getDogShows() {
        return dogShows;
    }

    public void setDogShows(Set<DogShow> dogShows) {
        this.dogShows = dogShows;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Set<Contest> getContests() {
        return contests;
    }

    public void setContests(Set<Contest> contests) {
        this.contests = contests;
    }
}
