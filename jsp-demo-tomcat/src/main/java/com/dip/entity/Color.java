package com.dip.entity;

import javax.persistence.*;

/**
 * Created by moneg on 29.12.2016.
 */
@Entity
@Table(name = "color")
public class Color {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int color_id;

    @Column(name = "Title")
    private String title;

    public int getColor_id() {
        return color_id;
    }

    public void setColor_id(int color_id) {
        this.color_id = color_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
