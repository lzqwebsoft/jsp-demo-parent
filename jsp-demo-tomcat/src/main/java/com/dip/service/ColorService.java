package com.dip.service;

import com.dip.entity.Color;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ColorService {
    Color addColor(Color color);
    void delete(int id);
    Color editColor(Color color);
    List<Color> getAll();
}
