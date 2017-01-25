package com.dip.repository;

import com.dip.entity.Breed;
import com.dip.entity.Colour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ColourRepository extends JpaRepository<Colour, Integer> {
    Colour findByTitle(String title);

    List<Colour> findByBreeds(Breed breed);
}
