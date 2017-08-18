package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "contest")
public class Contest {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int contest_id;

    private boolean checked;

    @Column(name = "contest_type_id")
    private int contest_type_id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Description")
    private String description;

    @OneToOne(optional = false)
    @JoinColumn(name="contest_type_id", unique = true, nullable = false,insertable = false,updatable = false)
    private ContestType contestType;

    @ManyToMany
    @JoinTable(name = "registered_contest_participant",
            joinColumns = @JoinColumn(name = "contest_id", referencedColumnName = "contest_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id", referencedColumnName = "participant_id"))
    private Set<Participant> participants;

    @ManyToMany
    @JoinTable(name = "registered_contest_dog",
            joinColumns = @JoinColumn(name = "contest_id", referencedColumnName = "contest_id"),
            inverseJoinColumns = @JoinColumn(name = "pedigree", referencedColumnName = "pedigree"))
    private Set<Dog> dogs;

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "contests")
    private Set<DogShow> dogShows;

    public int getContest_id() {
        return contest_id;
    }

    public void setContest_id(int contest_id) {
        this.contest_id = contest_id;
    }

    public int getContest_type_id() {
        return contest_type_id;
    }

    public void setContest_type_id(int contest_type_id) {
        this.contest_type_id = contest_type_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContestType getContestType() {
        return contestType;
    }


    public void setContestType(ContestType contestType) {
        this.contestType = contestType;
    }

    public Set<DogShow> getDogShows() {
        return dogShows;
    }

    public void setDogShows(Set<DogShow> dogShows) {
        this.dogShows = dogShows;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
