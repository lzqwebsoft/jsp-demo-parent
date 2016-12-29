package com.dip.service.Impl;

import com.dip.entity.FciGroup;
import com.dip.repository.FciGroupRepository;
import com.dip.service.FciGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class FciGroupServiceImpl implements FciGroupService{
    @Autowired
    FciGroupRepository fciGroupRepository;

    @Override
    public FciGroup addFciGroup(FciGroup fciGroup) {
        FciGroup saveFciGroup = fciGroupRepository.saveAndFlush(fciGroup);
        return saveFciGroup;
    }

    @Override
    public void delete(int id) {
    fciGroupRepository.delete(id);
    }

    @Override
    public FciGroup editFciGroup(FciGroup fciGroup) {
        return fciGroupRepository.saveAndFlush(fciGroup);
    }

    @Override
    public List<FciGroup> getAll() {
        return fciGroupRepository.findAll();
    }
}
