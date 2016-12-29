package com.dip.service.Impl;

import com.dip.entity.Color;
import com.dip.repository.ColorRepository;
import com.dip.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
@Component
public class ColorServiceImpl implements ColorService{
    @Autowired
    ColorRepository colorRepository;

    @Override
    public Color addColor(Color color) {
        Color saveColor = colorRepository.saveAndFlush(color);
        return saveColor;
    }

    @Override
    public void delete(int id) {
    colorRepository.delete(id);
    }

    @Override
    public Color editColor(Color color) {
        return colorRepository.saveAndFlush(color);
    }

    @Override
    public List<Color> getAll() {
        return colorRepository.findAll();
    }
}
