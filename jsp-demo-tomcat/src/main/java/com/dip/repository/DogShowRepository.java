package com.dip.repository;

import com.dip.entity.ContestType;
import com.dip.entity.DogShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by moneg on 28.12.2016.
 */
public interface DogShowRepository extends JpaRepository<DogShow, Integer> {

    void deleteByTitle(String title);


    @Query("Select d from DogShow d where d.title like %:title%")
    List<DogShow> findByTitleLike(@Param("title") String title);

    @Query("Select d from DogShow d where d.organizer like %:organizer%")
    List<DogShow> findByOrganizerLike(@Param("organizer") String organizer);

    @Query("Select d from DogShow d where d.sponsor like %:sponsor%")
    List<DogShow> findBySponsorLike(@Param("sponsor") String sponsor);


}

