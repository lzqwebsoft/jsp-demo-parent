package com.dip.service.Impl;

import com.dip.entity.Participant;
import com.dip.repository.ParticipantRepository;
import com.dip.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 05.01.2017.
 */
@Component
public class ParticipantServiceImpl implements ParticipantService{
    @Autowired
    ParticipantRepository participantRepository;

    @Override
    public Participant addParticipant(Participant participant) {
        Participant saveParticipant = participantRepository.saveAndFlush(participant);
        return saveParticipant;
    }

    @Override
    public void delete(int id) {
    participantRepository.delete(id);
    }

    @Override
    public Participant editParticipant(Participant participant) {
        return participantRepository.saveAndFlush(participant);
    }

    @Override
    public List<Participant> getAll() {
        return participantRepository.findAll();
    }
}
