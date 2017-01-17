package com.dip.repository;

import com.dip.entity.Contest;
import com.dip.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moneg on 05.01.2017.
 */
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {

    List<Participant> findByContests(Contest contest);
}
