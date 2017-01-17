package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 17.01.2017.
 */
@Entity
@Table(name = "registered_contest_dog")
public class Registered_Contest_Dog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int registered_contest_dog_id;

    @Column(name = "Number")
    private int number;

    @OneToOne(optional = false)
    @JoinColumn(name = "contest_id", unique = true, nullable = false)
    private Contest contest;

    @OneToOne(optional = false)
    @JoinColumn(name = "dog_id", unique = true, nullable = false)
    private Dog dog;

    public int getRegistered_contest_dog_id() {
        return registered_contest_dog_id;
    }

    public void setRegistered_contest_dog_id(int registered_contest_dog_id) {
        this.registered_contest_dog_id = registered_contest_dog_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
