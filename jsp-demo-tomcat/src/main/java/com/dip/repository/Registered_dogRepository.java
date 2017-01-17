package com.dip.repository;

import com.dip.entity.Dog;
import com.dip.entity.DogShow;
import com.dip.entity.Registered_dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by moneg on 07.01.2017.
 */
public interface Registered_dogRepository extends JpaRepository<Registered_dog, Integer> {


}
