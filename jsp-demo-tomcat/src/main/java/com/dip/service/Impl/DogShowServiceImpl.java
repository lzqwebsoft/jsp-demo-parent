package com.dip.service.Impl;

import com.dip.entity.DogShow;
import com.dip.repository.DogShowRepository;
import com.dip.service.DogShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 28.12.2016.
 */
@Component
public class DogShowServiceImpl implements DogShowService {
    @Autowired
    DogShowRepository dogShowRepository;

    @Override
    public DogShow addDogShow(DogShow dogShow) {
        DogShow saveDogShow = dogShowRepository.saveAndFlush(dogShow);
        return saveDogShow;
    }


    @Override
    public void delete(int id) {
        dogShowRepository.delete(id);
    }


    @Override
    public DogShow editDogShow(DogShow dogShow) {
        return dogShowRepository.saveAndFlush(dogShow);
    }

    @Override
    public List<DogShow> getAll() {
        return dogShowRepository.findAll();
    }
}
