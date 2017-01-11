package com.dip.repository;

import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import com.dip.entity.Judging;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
public interface JudgingRepository extends JpaRepository<Judging, Integer> {

    List<Expert> findByDogShow(DogShow dogShow);
}
