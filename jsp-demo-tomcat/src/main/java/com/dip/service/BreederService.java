package com.dip.service;


import com.dip.entity.Breeder;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface BreederService {
    Breeder addBreeder(Breeder breeder);
    void delete(int id);
    Breeder editBreeder(Breeder breeder);
    List<Breeder> getAll();
}
