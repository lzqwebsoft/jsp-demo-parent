package com.dip.entity;

/**
 * Created by moneg on 28.12.2016.
 */
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "dogshow")
public class DogShow {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "dogshow_id")
    private int dogshow_id;

    @Column(name = "Title")
    private String title;


    @Column(name = "Date")
    @DateTimeFormat(pattern = "dd MMM yyyy")
    private Date date;

    @Column(name = "Sponsor")
    private String sponsor;

    @Column(name = "Description")
    private String description;

    @Column(name = "Address")
    private String address;

    @Column(name = "Organizer")
    private String organizer;

    @Column(name="contest_id")
    private int contest_id;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "dogShow")
    private Set<Contest> contests;

    @ManyToMany
    @JoinTable(name = "registered_dog",
                joinColumns = @JoinColumn(name = "dogshow_id", referencedColumnName = "dogshow_id"),
                inverseJoinColumns = @JoinColumn(name = "dog_id", referencedColumnName = "dog_id"))
    private Set<Dog> dogs;

    @ManyToMany
    @JoinTable(name = "judging",
                joinColumns = @JoinColumn(name = "dogshow_id",referencedColumnName = "dogshow_id"),
                inverseJoinColumns = @JoinColumn(name = "expert_id",referencedColumnName = "expert_id"))
    private Set<Expert> experts;

    public int getContest_id() {
        return contest_id;
    }

    public void setContest_id(int contest_id) {
        this.contest_id = contest_id;
    }

    public Set<Contest> getContests() {
        return contests;
    }

    public void setContests(Set<Contest> contests) {
        this.contests = contests;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public int getDogshow_id() {
        return dogshow_id;
    }

    public void setDogshow_id(int dogshow_id) {
        this.dogshow_id = dogshow_id;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    public Set<Expert> getExperts() {
        return experts;
    }

    public void setExperts(Set<Expert> experts) {
        this.experts = experts;
    }
}
