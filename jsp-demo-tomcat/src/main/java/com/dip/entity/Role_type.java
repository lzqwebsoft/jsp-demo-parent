package com.dip.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Max on 09.02.2017.
 */
@Entity
@Table(name = "role_type")
public class Role_type {
    @Id
    @Column(name = "type_id")
    private int type_id;

    @Column(name="Title")
    private String title;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "role_type")
    private User user;

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
