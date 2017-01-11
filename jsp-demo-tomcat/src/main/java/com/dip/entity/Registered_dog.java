package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 04.01.2017.
 */
@Entity
@Table(name = "registered_dog")
public class Registered_dog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int registered_dog_id;

    @Column(name = "Number")
    private int number;

    @OneToOne(optional = false)
    @JoinColumn(name = "dog_id", unique = true, nullable = false)
    private Dog dog;

    @OneToOne(optional = false)
    @JoinColumn(name = "dogshow_id", unique = true, nullable = false)
    private DogShow dogShow;

    public int getRegistered_dog_id() {
        return registered_dog_id;
    }

    public void setRegistered_dog_id(int registered_dog_id) {
        this.registered_dog_id = registered_dog_id;
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

    public DogShow getDogShow() {
        return dogShow;
    }

    public void setDogShow(DogShow dogShow) {
        this.dogShow = dogShow;
    }
}
