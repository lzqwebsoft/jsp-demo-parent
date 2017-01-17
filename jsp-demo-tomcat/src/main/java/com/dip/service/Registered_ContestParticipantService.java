package com.dip.service;

import com.dip.entity.Contest;
import com.dip.entity.Dog;
import com.dip.entity.Participant;
import com.dip.entity.Registered_Contest_Participant;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
public interface Registered_ContestParticipantService {
    Registered_Contest_Participant addRegistered_Contest(Registered_Contest_Participant registered_contestParticipant);
    void delete(int id);
    Registered_Contest_Participant editRegistered_Contest(Registered_Contest_Participant registered_contestParticipant);
    List<Registered_Contest_Participant> getAll();
    int RandomNumber();
}
