package com.dip.repository;

import com.dip.entity.Contest;
import com.dip.entity.Registered_Contest_Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moneg on 17.01.2017.
 */
public interface Registered_Contest_DogRepository extends JpaRepository<Registered_Contest_Dog, Integer> {
    List<Registered_Contest_Dog> findByContest(Contest contest);
}
