package com.dip.service.Impl;

import com.dip.entity.Breed;
import com.dip.entity.Colour;
import com.dip.repository.ColourRepository;
import com.dip.service.ColourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class ColourServiceImpl implements ColourService {
    @Autowired
    ColourRepository colourRepository;

    @Override
    public Colour addColor(Colour colour) {
        Colour saveColour = colourRepository.saveAndFlush(colour);
        return saveColour;
    }

    @Override
    public Colour findOne(int id) {
        return colourRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
    colourRepository.delete(id);
    }

    @Override
    public Colour editColor(Colour colour) {
        return colourRepository.saveAndFlush(colour);
    }

    @Override
    public List<Colour> getAll() {
        return colourRepository.findAll();
    }

    @Override
    public Colour findByTitle(String title) {
        return colourRepository.findByTitle(title);
    }

    @Override
    public List<Colour> findByBreed(Breed breed) {
        return colourRepository.findByBreeds(breed);
    }
}
