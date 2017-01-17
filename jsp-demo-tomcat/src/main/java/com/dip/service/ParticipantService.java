package com.dip.service;

import com.dip.entity.Contest;
import com.dip.entity.Participant;

import java.util.List;

/**
 * Created by moneg on 05.01.2017.
 */
public interface ParticipantService {
    Participant addParticipant(Participant participant);
    void delete(int id);
    Participant editParticipant(Participant participant);
    List<Participant> getAll();
    List<Participant> findByContest(Contest contest);
}
