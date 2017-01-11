package com.dip.service.Impl;

import com.dip.entity.Contest_type;
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
    public Contest_type addContest(Contest_type contest) {
        Contest_type saveContestType = contestTypeRepository.saveAndFlush(contest);
        return saveContestType;
    }

    @Override
    public Contest_type getById(int contest_type_id) {
        return contestTypeRepository.getOne(contest_type_id);
    }

    @Override
    public void delete(int id) {
    contestTypeRepository.delete(id);
    }

    @Override
    public Contest_type editContest(Contest_type contest) {
        return contestTypeRepository.saveAndFlush(contest);
    }

    @Override
    public List<Contest_type> getAll() {
        return contestTypeRepository.findAll();
    }
}
