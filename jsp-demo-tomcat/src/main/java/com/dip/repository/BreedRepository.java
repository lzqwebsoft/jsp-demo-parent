package com.dip.repository;

import com.dip.entity.Breed;
import com.dip.entity.Dog;
import com.dip.entity.FciGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface BreedRepository extends JpaRepository<Breed, Integer> {

    List<Breed> findByfciGroup(FciGroup fciGroup);

    Breed findByTitle(String title);

//    @Query("Select b from Breed b where 'b.fciGroup.number' like %:number%")
//    Breed findByFciNumber(@Param("number") int number);
}
