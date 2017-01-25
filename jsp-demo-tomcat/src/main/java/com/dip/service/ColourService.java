package com.dip.service;

import com.dip.entity.Breed;
import com.dip.entity.Colour;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ColourService {
    Colour addColor(Colour colour);
    Colour findOne(int id);
    void delete(int id);
    Colour editColor(Colour colour);
    List<Colour> getAll();
    Colour findByTitle(String title);
    List<Colour> findByBreed(Breed breed);
}
