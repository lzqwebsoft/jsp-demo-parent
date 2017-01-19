package com.dip.service.Impl;

import com.dip.entity.ContestType;
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

    @Override
    public DogShow getById(int id) {
        return dogShowRepository.getOne(id);
    }

    @Override
    public DogShow setById(int id) {
        return dogShowRepository.findOne(id);
    }

    @Override
    public List<DogShow> findByTitle(String title) {
        return dogShowRepository.findByTitleLike(title);
    }

    @Override
    public List<DogShow> findBySponsor(String sponsor) {
        return dogShowRepository.findBySponsorLike(sponsor);
    }

    @Override
    public List<DogShow> findByOrganizer(String organizer) {
        return dogShowRepository.findByOrganizerLike(organizer);
    }

    @Override
    public List<DogShow> findByForwhom(String forwhom) {
        return dogShowRepository.findByForwhomLike(forwhom);
    }

    @Override
    public List<DogShow> findByContestType(ContestType contestType) {
        return dogShowRepository.findByContestContestType(contestType);
    }

    private boolean existDogShow(DogShow dogShow){
        return dogShowRepository.exists(dogShow.getDogshow_id());
    }

//    @Override
//    public List<DogShow> findByContest(int contest_type_id) {
//        return dogShowRepository.findByContestTypeId(contest_type_id);
//    }


}
