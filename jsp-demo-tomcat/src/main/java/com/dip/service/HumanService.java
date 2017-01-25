package com.dip.service;

import com.dip.entity.Human;

import java.util.List;

/**
 * Created by moneg on 24.01.2017.
 */
public interface HumanService {
    Human addHuman(Human human);
    Human getById(int id);
    void delete(int id);
    Human editHuman(Human human);
    List<Human> getAll();
}
