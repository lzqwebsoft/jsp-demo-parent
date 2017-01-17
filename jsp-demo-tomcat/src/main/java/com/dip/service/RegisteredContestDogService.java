package com.dip.service;

import com.dip.entity.Contest;
import com.dip.entity.Registered_Contest_Dog;

import java.util.List;

/**
 * Created by moneg on 17.01.2017.
 */
public interface RegisteredContestDogService {
    Registered_Contest_Dog addRegisteredContestDog(Registered_Contest_Dog registered_contest_dog);
    void delete(int id);
    Registered_Contest_Dog editRegisteredContestDog(Registered_Contest_Dog registered_contest_dog);
    int RandomNumber();
    List<Registered_Contest_Dog> getAll();
    List<Registered_Contest_Dog> findByContest(Contest contest);
}
