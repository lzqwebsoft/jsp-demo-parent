package com.dip.service;

import com.dip.entity.Dog;
import com.dip.entity.DogShow;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface DogService {
    Dog addDog(Dog dog);
    void delete(int id);
    Dog editDog(Dog dog);
    List<Dog> getAll();
    List<Dog> findByDogShow(DogShow dogShow);
}
