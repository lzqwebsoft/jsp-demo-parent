package com.dip.service.Impl;

import com.dip.entity.Breed;
import com.dip.entity.FciGroup;
import com.dip.repository.BreedRepository;
import com.dip.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class BreedServiceImpl implements BreedService{
    @Autowired
    BreedRepository breedRepository;

    @Override
    public Breed addBreed(Breed breed) {
        Breed saveBreed = breedRepository.saveAndFlush(breed);
        return saveBreed;
    }

    @Override
    public Breed findOne(int id) {
        return breedRepository.findOne(id);
    }


    @Override
    public Breed findByTitle(String title) {
        return breedRepository.findByTitle(title);
    }

    @Override
    public void delete(int id) {
    breedRepository.delete(id);
    }

    @Override
    public Breed editBreed(Breed breed) {
        return breedRepository.saveAndFlush(breed);
    }

    @Override
    public List<Breed> getAll() {
        return breedRepository.findAll();
    }

    @Override
    public List<Breed> findByFciGroup(FciGroup fciGroup) {
        List<Breed> breeds = breedRepository.findByfciGroup(fciGroup);
        return breeds;
    }
}
