package com.dip.repository;

import com.dip.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ColorRepository extends JpaRepository<Color, Integer> {
}
