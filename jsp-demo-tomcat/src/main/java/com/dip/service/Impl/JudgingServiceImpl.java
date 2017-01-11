package com.dip.service.Impl;

import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import com.dip.entity.Judging;
import com.dip.repository.JudgingRepository;
import com.dip.service.JudgingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
@Component
public class JudgingServiceImpl implements JudgingService{
    @Autowired
    JudgingRepository judgingRepository;

    @Override
    public Judging addJudging(Judging judging) {
        Judging saveJudging = judgingRepository.saveAndFlush(judging);
        return saveJudging;
    }

    @Override
    public void delete(int id) {
    judgingRepository.delete(id);
    }

    @Override
    public Judging editJudging(Judging judging) {
        return judgingRepository.saveAndFlush(judging);
    }

    @Override
    public List<Judging> getAll() {
        return judgingRepository.findAll();
    }

    @Override
    public List<Expert> findByDogShow(DogShow dogShow) {
        return judgingRepository.findByDogShow(dogShow);
    }
}
