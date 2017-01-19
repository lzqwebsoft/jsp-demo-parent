package com.dip.service.Impl;

import com.dip.entity.Contest;
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

    @Override
    public List<Dog> findByContest(Contest contest) {
        return dogRepository.findByContests(contest);
    }

    @Override
    public List<Dog> findByBreed(String breed) {
        return dogRepository.findByBreedLike(breed);
    }

    @Override
    public List<Dog> findByBreederFname(String breederFname) {
        return dogRepository.findByBreederFnameLike(breederFname);
    }

    @Override
    public List<Dog> findByBreederSname(String breederSname) {
        return dogRepository.findByBreederSnameLike(breederSname);
    }

    @Override
    public List<Dog> findByBreederLname(String breederLname) {
        return dogRepository.findByBreederLnameLike(breederLname);
    }

    @Override
    public List<Dog> findByColor(String color) {
        return dogRepository.findByColorLike(color);
    }

    @Override
    public List<Dog> findByDam(String dam) {
        return dogRepository.findByDamLike(dam);
    }

    @Override
    public List<Dog> findBySire(String sire) {
        return dogRepository.findBySireLike(sire);
    }

    @Override
    public List<Dog> findByGender(String gender) {
        return dogRepository.findByGenderLike(gender);
    }

    @Override
    public List<Dog> findByName(String name) {
        return dogRepository.findByNameLike(name);
    }

    @Override
    public List<Dog> findByOwnerFname(String ownerFname) {
        return dogRepository.findByOwnerFnameLike(ownerFname);
    }

    @Override
    public List<Dog> findByOwnerSname(String ownerSname) {
        return dogRepository.findByOwnerSnameLike(ownerSname);
    }

    @Override
    public List<Dog> findByOwnerLname(String ownerLname) {
        return dogRepository.findByOwnerLnameLike(ownerLname);
    }

}
