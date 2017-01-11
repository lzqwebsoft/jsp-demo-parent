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

//    @Query(value = "select d.dog_id from registered_dog d where d.dogshow_id = :id")
//    List<Dog> findDogs(@Param("id") int id);

//    @Query(value = "SELECT * FROM registered_dog WHERE dogshow_id= ?0", nativeQuery = true)
//    List<Dog> findByDogShowId(int id);

//    List<Dog> findByDogshowId(int id);

}
