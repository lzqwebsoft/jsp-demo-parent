package com.dip.repository;

import com.dip.entity.Breed;
import com.dip.entity.FciGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface BreedRepository extends JpaRepository<Breed, Integer> {

    List<Breed> findByfciGroup(FciGroup fciGroup);
}
