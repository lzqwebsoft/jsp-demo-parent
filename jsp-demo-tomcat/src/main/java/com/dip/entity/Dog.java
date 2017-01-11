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
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int dog_id;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Name")
    private String name;

    @Column(name = "Dob")
    private Date dob;

    @Column(name = "Chip")
    private String chip;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Pedigree")
    private String pedigree;

    @Column(name = "Sire")
    private String sire;

    @Column(name = "Dam")
    private String dam;

    @Column(name = "color_id")
    private int color_id;

    @Column(name = "breed_id")
    private int breed_id;

    @Column(name = "breeder_id")
    private int breeder_id;

    @Column(name = "owner_id")
    private int owner_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "owner_id", nullable = false, insertable = false, updatable = false)
    private Owner owner;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name="breed_id", unique = true, nullable = false,insertable = false,updatable = false)
    private Breed breed;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dog")
    private Set<Breeder> breeders;

    @OneToOne(optional = false)
    @JoinColumn(name="breeder_id", unique = true, nullable = false,insertable = false,updatable = false)
    private Breeder breeder;

    @OneToOne(optional = false)
    @JoinColumn(name="color_id", unique = true, nullable = false,insertable = false,updatable = false)
    private Color color;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "dogs")
    private Set<DogShow> dogShows;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDog_id() {
        return dog_id;
    }

    public void setDog_id(int dog_id) {
        this.dog_id = dog_id;
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

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public int getColor_id() {
        return color_id;
    }

    public void setColor_id(int color_id) {
        this.color_id = color_id;
    }

    public int getBreed_id() {
        return breed_id;
    }

    public void setBreed_id(int breed_id) {
        this.breed_id = breed_id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Set<Breeder> getBreeders() {
        return breeders;
    }

    public void setBreeders(Set<Breeder> breeders) {
        this.breeders = breeders;
    }

    public Breeder getBreeder() {
        return breeder;
    }

    public void setBreeder(Breeder breeder) {
        this.breeder = breeder;
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

    public int getBreeder_id() {
        return breeder_id;
    }

    public void setBreeder_id(int breeder_id) {
        this.breeder_id = breeder_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }
}
