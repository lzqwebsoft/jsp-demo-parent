package com.dip.service;

import com.dip.entity.Owner;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface OwnerService {
    Owner addOwner(Owner owner);
    void delete(int id);
    Owner editOwner(Owner owner);
    List<Owner> getAll();
}
