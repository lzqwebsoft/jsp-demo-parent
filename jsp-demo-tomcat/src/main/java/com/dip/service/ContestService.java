package com.dip.service;

import com.dip.entity.Contest;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ContestService {
    Contest addContest(Contest contest);
    void delete(int id);
    Contest editContest(Contest contest);
    List<Contest> getAll();
}
