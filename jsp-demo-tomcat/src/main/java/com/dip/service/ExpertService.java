package com.dip.service;

import com.dip.entity.DogShow;
import com.dip.entity.Expert;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
public interface ExpertService {
    Expert addExpert(Expert expert);
    void delete(int id);
    Expert editExpert(Expert expert);
    List<Expert> getAll();
    List<Expert> findByDogShow(DogShow dogShow);
}
