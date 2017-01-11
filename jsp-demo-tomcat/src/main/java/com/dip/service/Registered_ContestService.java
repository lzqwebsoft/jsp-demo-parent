package com.dip.service;

import com.dip.entity.Registered_Contest;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
public interface Registered_ContestService {
    Registered_Contest addRegistered_Contest(Registered_Contest registered_contest);
    void delete(int id);
    Registered_Contest editRegistered_Contest(Registered_Contest registered_contest);
    List<Registered_Contest> getAll();
}
