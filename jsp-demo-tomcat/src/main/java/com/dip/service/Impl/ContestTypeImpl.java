package com.dip.service.Impl;

import com.dip.entity.ContestType;
import com.dip.repository.ContestTypeRepository;
import com.dip.service.ContestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class ContestTypeImpl  implements ContestTypeService{
    @Autowired
    ContestTypeRepository contestTypeRepository;

    @Override
    public ContestType addContest(ContestType contest) {
        ContestType saveContestType = contestTypeRepository.saveAndFlush(contest);
        return saveContestType;
    }

    @Override
    public ContestType getById(int contest_type_id) {
        return contestTypeRepository.getOne(contest_type_id);
    }

    @Override
    public void delete(int id) {
    contestTypeRepository.delete(id);
    }

    @Override
    public ContestType editContest(ContestType contest) {
        return contestTypeRepository.saveAndFlush(contest);
    }

    @Override
    public List<ContestType> getAll() {
        return contestTypeRepository.findAll();
    }
}
