package com.dip.service.Impl;

import com.dip.entity.Contest;
import com.dip.entity.Contest_type;
import com.dip.entity.DogShow;
import com.dip.repository.ContestRepository;
import com.dip.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class ContestServiceImpl implements ContestService {
    @Autowired
    ContestRepository contestRepository;

    @Override
    public Contest addContest(Contest contest) {
        Contest saveContest = contestRepository.save(contest);
        return saveContest;
    }

    @Override
    public Contest getById(int id) {
        return contestRepository.getOne(id);
    }

    @Override
    public void delete(int id) {
        contestRepository.delete(id);
    }


    @Override
    public Contest editContest(Contest contest) {
        return contestRepository.saveAndFlush(contest);
    }

    @Override
    public List<Contest> getAll() {
        return contestRepository.findAll();
    }
}
