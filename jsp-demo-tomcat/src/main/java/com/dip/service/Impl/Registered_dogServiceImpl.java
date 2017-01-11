package com.dip.service.Impl;

import com.dip.entity.Dog;
import com.dip.entity.DogShow;
import com.dip.entity.Registered_dog;
import com.dip.repository.DogShowRepository;
import com.dip.repository.Registered_dogRepository;
import com.dip.service.DogShowService;
import com.dip.service.Registered_dogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by moneg on 07.01.2017.
 */
@Component
public class Registered_dogServiceImpl implements Registered_dogService{
    @Autowired
    Registered_dogRepository registered_dogRepository;

    @Override
    public Registered_dog addRegisteredDog(Registered_dog registered_dog) {
        Registered_dog saveRegisteredDog = registered_dogRepository.saveAndFlush(registered_dog);
        return saveRegisteredDog;
    }

    @Override
    public void delete(int id) {
    registered_dogRepository.delete(id);
    }

    @Override
    public Registered_dog editRegisteredDog(Registered_dog registered_dog) {
        return registered_dogRepository.saveAndFlush(registered_dog);
    }

    @Override
    public List<Registered_dog> getAll() {
        return registered_dogRepository.findAll();
    }

    @Override
    public int RandomNumber() {
        Random randNumber = new Random();
        int iNumber = randNumber.nextInt(500) + 1;
        return iNumber;
    }

    @Override
    public List<Dog> findByDogShowId(int id) {
        return null;
    }


}
