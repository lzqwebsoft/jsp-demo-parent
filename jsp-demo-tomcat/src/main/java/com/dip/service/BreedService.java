package com.dip.service;

import com.dip.entity.Breed;
import com.dip.entity.FciGroup;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface BreedService {
    Breed addBreed(Breed breed);
    Breed findOne(int id);
    Breed findByTitle(String title);
    void delete(int id);
    Breed editBreed(Breed breed);
    List<Breed> getAll();
    List<Breed> findByFciGroup(FciGroup fciGroup);
}
