package com.dip.repository;

import com.dip.entity.Contest;
import com.dip.entity.ContestType;
import com.dip.entity.DogShow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ContestRepository extends JpaRepository<Contest, Integer> {

    List<Contest> findByContestType(ContestType contestType);


    List<Contest> findByDogShows(DogShow dogShow);
//    Contest findByDogShow(DogShow dogShow);
}
