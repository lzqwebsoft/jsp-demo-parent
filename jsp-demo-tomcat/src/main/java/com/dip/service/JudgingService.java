package com.dip.service;


import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import com.dip.entity.Judging;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
public interface JudgingService {
    Judging addJudging(Judging judging);
    void delete(int id);
    Judging editJudging(Judging judging);
    List<Judging> getAll();
    List<Expert> findByDogShow(DogShow dogShow);
}
