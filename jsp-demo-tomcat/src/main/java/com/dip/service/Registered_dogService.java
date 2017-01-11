package com.dip.service;

import com.dip.entity.Dog;
import com.dip.entity.DogShow;
import com.dip.entity.Registered_dog;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
public interface Registered_dogService {
    Registered_dog addRegisteredDog(Registered_dog registered_dog);
    void delete(int id);
    Registered_dog editRegisteredDog(Registered_dog registered_dog);
    List<Registered_dog> getAll();
    int RandomNumber();
    List<Dog> findByDogShowId(int id);
}
