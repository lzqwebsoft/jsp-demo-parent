package com.dip.service;

import com.dip.entity.Contest;
import com.dip.entity.Contest_type;
import com.dip.entity.DogShow;
import com.dip.entity.Expert;

import java.util.List;
import java.util.Set;

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
    DogShow findByTitle(String title);
    void deleteByTitle(String title);
//    List<DogShow> findByContest(int contest_type_id);
}
