package com.dip.repository;

import com.dip.entity.ContestType;
import com.dip.entity.DogShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by moneg on 28.12.2016.
 */
public interface DogShowRepository extends JpaRepository<DogShow, Integer> {

    void deleteByTitle(String title);

    List<DogShow> findByTitle(String title);

    List<DogShow> findByContestContestType(ContestType contestType);
}

