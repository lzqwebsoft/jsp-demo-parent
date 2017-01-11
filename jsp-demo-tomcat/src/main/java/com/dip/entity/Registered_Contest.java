package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 07.01.2017.
 */
@Entity
@Table(name = "registered_contest")
public class Registered_Contest {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int registered_contest_id;

    @Column(name = "Number")
    private int number;

    @OneToOne(optional = false)
    @JoinColumn(name = "dog_id", unique = true, nullable = false)
    private Dog dog;

    @OneToOne(optional = false)
    @JoinColumn(name = "contest_id", unique = true, nullable = false)
    private Contest contest;

    @OneToOne(optional = false)
    @JoinColumn(name = "participant_id", unique = true, nullable = false)
    private Participant participant;

    public int getRegistered_contest_id() {
        return registered_contest_id;
    }

    public void setRegistered_contest_id(int registered_contest_id) {
        this.registered_contest_id = registered_contest_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }
}
