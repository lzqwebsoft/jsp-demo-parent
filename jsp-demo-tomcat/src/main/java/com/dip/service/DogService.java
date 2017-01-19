package com.dip.service;

import com.dip.entity.Contest;
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
    List<Dog> findByContest(Contest contest);
    List<Dog> findByBreed(String breed);
    List<Dog> findByBreederFname(String breederFname);
    List<Dog> findByBreederSname(String breederSname);
    List<Dog> findByBreederLname(String breederLname);
    List<Dog> findByColor(String color);
    List<Dog> findByDam(String dam);
    List<Dog> findBySire(String sire);
    List<Dog> findByGender(String gender);
    List<Dog> findByName(String name);
    List<Dog> findByOwnerFname(String ownerFname);
    List<Dog> findByOwnerSname(String ownerSname);
    List<Dog> findByOwnerLname(String ownerLname);
}
