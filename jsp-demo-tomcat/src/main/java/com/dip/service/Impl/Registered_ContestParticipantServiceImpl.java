package com.dip.service.Impl;

import com.dip.entity.Contest;
import com.dip.entity.Dog;
import com.dip.entity.Participant;
import com.dip.entity.Registered_Contest_Participant;
import com.dip.repository.Registered_ContestRepository;
import com.dip.service.Registered_ContestParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * Created by moneg on 07.01.2017.
 */
@Component
public class Registered_ContestParticipantServiceImpl implements Registered_ContestParticipantService {
    @Autowired
    Registered_ContestRepository registered_contestRepository;

    @Override
    public Registered_Contest_Participant addRegistered_Contest(Registered_Contest_Participant registered_contestParticipant) {
        Registered_Contest_Participant saveRegistered_ContestParticipant = registered_contestRepository.saveAndFlush(registered_contestParticipant);
        return saveRegistered_ContestParticipant;
    }

    @Override
    public void delete(int id) {
    registered_contestRepository.delete(id);
    }

    @Override
    public Registered_Contest_Participant editRegistered_Contest(Registered_Contest_Participant registered_contestParticipant) {
        return registered_contestRepository.saveAndFlush(registered_contestParticipant);
    }

    @Override
    public List<Registered_Contest_Participant> getAll() {
        return registered_contestRepository.findAll();
    }

    @Override
    public int RandomNumber() {
        Random randNumber = new Random();
        int iNumber = randNumber.nextInt(50) + 1;
        return iNumber;
    }

}
