package com.dip.service;

import com.dip.entity.DogShow;

import java.util.List;

/**
 * Created by moneg on 28.12.2016.
 */
public interface DogShowService {
    DogShow addDogShow(DogShow dogShow);
    void delete(long id);
    DogShow editDogShow(DogShow dogShow);
    List<DogShow> getAll();
}
