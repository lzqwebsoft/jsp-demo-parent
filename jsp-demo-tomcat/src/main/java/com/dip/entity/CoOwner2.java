package com.dip.entity;

import javax.persistence.*;

/**
 * Created by Max on 05.02.2017.
 */
@Entity
@Table(name = "coowner2")
public class CoOwner2 {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int coOwner_id;

    @OneToOne(optional = false)
    @JoinColumn(name="human_id", unique = true, nullable = false)
    private Human human;

    public int getCoOwner_id() {
        return coOwner_id;
    }

    public void setCoOwner_id(int coOwner_id) {
        this.coOwner_id = coOwner_id;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
