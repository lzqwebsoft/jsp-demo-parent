package com.dip.repository;

import com.dip.entity.DogShow;
import com.dip.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

/**
 * Created by moneg on 07.01.2017.
 */
public interface ExpertRepository extends JpaRepository<Expert, Integer> {

    List<Expert> findByDogShows(DogShow dogShow);
}
