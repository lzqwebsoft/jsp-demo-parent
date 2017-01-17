package com.dip.service;

import com.dip.entity.ContestType;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ContestTypeService {
    ContestType addContest(ContestType contest);
    ContestType getById(int contest_type_id);
    void delete(int id);
    ContestType editContest(ContestType contest);
    List<ContestType> getAll();
}
