package com.dip.service;

import com.dip.entity.Contest_type;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ContestTypeService {
    Contest_type addContest(Contest_type contest);
    void delete(Long id);
    Contest_type editContest(Contest_type contest);
    List<Contest_type> getAll();
}
