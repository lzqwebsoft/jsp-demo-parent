package com.dip.service.Impl;

import com.dip.entity.Human;
import com.dip.repository.HumanRepository;
import com.dip.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 24.01.2017.
 */
@Component
public class HumanServiceImpl implements HumanService{
    @Autowired
    HumanRepository humanRepository;

    @Override
    public Human addHuman(Human human) {
        Human saveHuman = humanRepository.saveAndFlush(human);
        return saveHuman;
    }

    @Override
    public Human getById(int id) {
        return humanRepository.getOne(id);
    }

    @Override
    public void delete(int id) {
    humanRepository.delete(id);
    }

    @Override
    public Human editHuman(Human human) {
        return humanRepository.saveAndFlush(human);
    }

    @Override
    public List<Human> getAll() {
        return humanRepository.findAll();
    }
}
