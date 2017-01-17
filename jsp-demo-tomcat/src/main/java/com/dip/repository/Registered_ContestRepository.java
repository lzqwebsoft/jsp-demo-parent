package com.dip.repository;

import com.dip.entity.Contest;
import com.dip.entity.Dog;
import com.dip.entity.Participant;
import com.dip.entity.Registered_Contest_Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
public interface Registered_ContestRepository extends JpaRepository<Registered_Contest_Participant, Integer> {
    List<Participant> findByContest(Contest contest);
}
