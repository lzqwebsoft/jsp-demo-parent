package com.dip.service.Impl;

import com.dip.entity.Dog;
import com.dip.entity.DogShow;
import com.dip.repository.DogRepository;
import com.dip.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class DogServiceImpl implements DogService{
    @Autowired
    DogRepository dogRepository;
    @Override
    public Dog addDog(Dog dog) {
        Dog saveDog = dogRepository.saveAndFlush(dog);
        return saveDog;
    }

    @Override
    public void delete(int id) {
    dogRepository.delete(id);
    }

    @Override
    public Dog editDog(Dog dog) {
        return dogRepository.saveAndFlush(dog);
    }

    @Override
    public List<Dog> getAll() {
        return dogRepository.findAll();
    }

    @Override
    public List<Dog> findByDogShow(DogShow dogShow) {
        return dogRepository.findByDogShows(dogShow);
    }

}
