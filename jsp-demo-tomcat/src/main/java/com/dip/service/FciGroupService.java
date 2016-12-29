package com.dip.service;

import com.dip.entity.FciGroup;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface FciGroupService {
    FciGroup addFciGroup(FciGroup fciGroup);
    void delete(int id);
    FciGroup editFciGroup(FciGroup fciGroup);
    List<FciGroup> getAll();
}
