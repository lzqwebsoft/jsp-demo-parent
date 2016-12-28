package com.dip.repository;

import com.dip.entity.DogShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by moneg on 28.12.2016.
 */
public interface DogShowRepository extends JpaRepository<DogShow, Long> {

}

