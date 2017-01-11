package com.dip.repository;

import com.dip.entity.Contest;
import com.dip.entity.Contest_type;
import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

/**
 * Created by moneg on 28.12.2016.
 */
public interface DogShowRepository extends JpaRepository<DogShow, Integer> {

    DogShow findByTitle(String title);
    void deleteByTitle(String title);

//    @Query("select d from DogShow d where Contest.contest_type_id= :contest_type_id")
//    List<DogShow> findByContestTypeId(@Param("contest_type_id") int contest_type_id);
}

