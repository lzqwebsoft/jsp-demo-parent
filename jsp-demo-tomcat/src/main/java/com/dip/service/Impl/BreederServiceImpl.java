package com.dip.service.Impl;

import com.dip.entity.Breeder;
import com.dip.repository.BreederRepository;
import com.dip.service.BreederService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class BreederServiceImpl implements BreederService{
    @Autowired
    BreederRepository breederRepository;

    @Override
    public Breeder addBreeder(Breeder breeder) {
        Breeder saveBreeder = breederRepository.saveAndFlush(breeder);
        return saveBreeder;
    }

    @Override
    public void delete(int id) {
    delete(id);
    }

    @Override
    public Breeder editBreeder(Breeder breeder) {
        return breederRepository.saveAndFlush(breeder);
    }

    @Override
    public List<Breeder> getAll() {
        return breederRepository.findAll();
    }
}
