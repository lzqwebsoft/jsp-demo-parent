package com.dip.repository;

import com.dip.entity.Dog;
import com.dip.entity.DogShow;
import org.jboss.logging.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface DogRepository extends JpaRepository<Dog, Integer> {


    List<Dog> findByDogShows(DogShow dogShow);
}
