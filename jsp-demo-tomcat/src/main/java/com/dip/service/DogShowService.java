package com.dip.service;

import com.dip.entity.ContestType;
import com.dip.entity.DogShow;

import java.util.List;

/**
 * Created by moneg on 28.12.2016.
 */
public interface DogShowService {
    DogShow addDogShow(DogShow dogShow);
    void delete(int id);
    DogShow editDogShow(DogShow dogShow);
    List<DogShow> getAll();
    DogShow getById(int id);
    DogShow setById(int id);
    List<DogShow> findByTitle(String title);
    List<DogShow> findByContestType(ContestType contestType);
}
