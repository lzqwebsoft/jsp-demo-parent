package com.dip.service.Impl;

import com.dip.entity.Registered_Contest;
import com.dip.repository.Registered_ContestRepository;
import com.dip.service.Registered_ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
@Component
public class Registered_ContestServiceImpl implements Registered_ContestService{
    @Autowired
    Registered_ContestRepository registered_contestRepository;

    @Override
    public Registered_Contest addRegistered_Contest(Registered_Contest registered_contest) {
        Registered_Contest saveRegistered_Contest = registered_contestRepository.saveAndFlush(registered_contest);
        return saveRegistered_Contest;
    }

    @Override
    public void delete(int id) {
    registered_contestRepository.delete(id);
    }

    @Override
    public Registered_Contest editRegistered_Contest(Registered_Contest registered_contest) {
        return registered_contestRepository.saveAndFlush(registered_contest);
    }

    @Override
    public List<Registered_Contest> getAll() {
        return registered_contestRepository.findAll();
    }
}
