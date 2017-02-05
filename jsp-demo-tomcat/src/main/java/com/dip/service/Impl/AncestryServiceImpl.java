package com.dip.service.Impl;

import com.dip.entity.Ancestry;
import com.dip.repository.AncestryRepository;
import com.dip.service.AncestryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Max on 05.02.2017.
 */
public class AncestryServiceImpl implements AncestryService{
    @Autowired
    AncestryRepository ancestryRepository;

    @Override
    public Ancestry addAncestry(Ancestry ancestry) {
        Ancestry saveAncesrty = ancestryRepository.saveAndFlush(ancestry);
        return saveAncesrty;
    }

    @Override
    public void delete(int id) {
    ancestryRepository.delete(id);
    }

    @Override
    public Ancestry editAncestry(Ancestry ancestry) {
        return ancestryRepository.saveAndFlush(ancestry);
    }
}
