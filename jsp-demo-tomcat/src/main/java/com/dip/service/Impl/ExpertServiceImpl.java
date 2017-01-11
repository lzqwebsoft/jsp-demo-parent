package com.dip.service.Impl;

import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import com.dip.repository.ExpertRepository;
import com.dip.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
@Component
public class ExpertServiceImpl implements ExpertService{
    @Autowired
    ExpertRepository expertRepository;

    @Override
    public Expert addExpert(Expert expert) {
        Expert saveExpert = expertRepository.saveAndFlush(expert);
        return saveExpert;
    }

    @Override
    public void delete(int id) {
    expertRepository.delete(id);
    }

    @Override
    public Expert editExpert(Expert expert) {
        return expertRepository.saveAndFlush(expert);
    }

    @Override
    public List<Expert> getAll() {
        return expertRepository.findAll();
    }

    @Override
    public List<Expert> findByDogShow(DogShow dogShow) {
        return expertRepository.findByDogShows(dogShow);
    }

}
