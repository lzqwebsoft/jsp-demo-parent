package com.dip.service.Impl;

import com.dip.entity.Contest;
import com.dip.entity.Registered_Contest_Dog;
import com.dip.entity.Registered_dog;
import com.dip.repository.Registered_Contest_DogRepository;
import com.dip.service.RegisteredContestDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * Created by moneg on 17.01.2017.
 */
@Component
public class RegisteredContestDogServiceImpl implements RegisteredContestDogService{

    @Autowired
    Registered_Contest_DogRepository registered_contest_dogRepository;

    @Override
    public Registered_Contest_Dog addRegisteredContestDog(Registered_Contest_Dog registered_contest_dog) {
        Registered_Contest_Dog registered_contest_dog1 = registered_contest_dogRepository.saveAndFlush(registered_contest_dog);
        return registered_contest_dog1;
    }

    @Override
    public void delete(int id) {
    registered_contest_dogRepository.delete(id);
    }

    @Override
    public Registered_Contest_Dog editRegisteredContestDog(Registered_Contest_Dog registered_contest_dog) {
        return registered_contest_dogRepository.saveAndFlush(registered_contest_dog);
    }

    @Override
    public int RandomNumber() {
        Random randNumber = new Random();
        int iNumber = randNumber.nextInt(50) + 1;
        return iNumber;
    }

    @Override
    public List<Registered_Contest_Dog> getAll() {
        return registered_contest_dogRepository.findAll();
    }

    @Override
    public List<Registered_Contest_Dog> findByContest(Contest contest) {
        return registered_contest_dogRepository.findByContest(contest);
    }
}
