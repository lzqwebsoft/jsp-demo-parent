package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Max on 04.02.2017.
 */
@Entity
@Table(name = "ancestry")
public class Ancestry {
    @Id
    @Column(name = "ancestry_id")
    private long ancestry_id;

    @Column(name = "SireName")
    private String sireName;

    @Column(name = "DamName")
    private String damName;

    @Column(name = "SirePedigree")
    private String sirePedigree;

    @Column(name = "DamPedigree")
    private String damPedigree;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ancestries")
    private Set<Dog> dogs;

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    public long getAncestry_id() {
        return ancestry_id;
    }

    public void setAncestry_id(long ancestry_id) {
        this.ancestry_id = ancestry_id;
    }

    public String getSireName() {
        return sireName;
    }

    public void setSireName(String sireName) {
        this.sireName = sireName;
    }

    public String getDamName() {
        return damName;
    }

    public void setDamName(String damName) {
        this.damName = damName;
    }

    public String getSirePedigree() {
        return sirePedigree;
    }

    public void setSirePedigree(String sirePedigree) {
        this.sirePedigree = sirePedigree;
    }

    public String getDamPedigree() {
        return damPedigree;
    }

    public void setDamPedigree(String damPedigree) {
        this.damPedigree = damPedigree;
    }
}
