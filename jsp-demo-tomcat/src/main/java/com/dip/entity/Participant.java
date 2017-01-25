package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by moneg on 05.01.2017.
 */
@Entity
@Table(name = "participant")
public class Participant {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int participant_id;

    @Column(name = "Age")
    private int age;

    @OneToOne(optional = false)
    @JoinColumn(name="human_id", unique = true, nullable = false)
    private Human human;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "participants")
    private Set<Contest> contests;

    public Set<Contest> getContests() {
        return contests;
    }

    public void setContests(Set<Contest> contests) {
        this.contests = contests;
    }

    public int getParticipant_id() {
        return participant_id;
    }

    public void setParticipant_id(int participant_id) {
        this.participant_id = participant_id;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
