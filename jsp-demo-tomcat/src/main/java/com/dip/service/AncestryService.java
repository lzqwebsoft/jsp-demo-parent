package com.dip.service;

import com.dip.entity.Ancestry;

import java.util.List;

/**
 * Created by Max on 05.02.2017.
 */
public interface AncestryService {
    Ancestry addAncestry(Ancestry ancestry);
    void delete(int id);
    Ancestry editAncestry(Ancestry ancestry);
}
