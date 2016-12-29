package com.dip.service.Impl;

import com.dip.entity.Owner;
import com.dip.repository.OwnerRepository;
import com.dip.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    OwnerRepository ownerRepository;

    @Override
    public Owner addOwner(Owner owner) {
        Owner saveOwner = ownerRepository.saveAndFlush(owner);
        return saveOwner;
    }

    @Override
    public void delete(int id) {
    ownerRepository.delete(id);
    }

    @Override
    public Owner editOwner(Owner owner) {
        return ownerRepository.saveAndFlush(owner);
    }

    @Override
    public List<Owner> getAll() {
        return ownerRepository.findAll();
    }
}
