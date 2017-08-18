package com.dip.repository;

import com.dip.entity.Breed;
import com.dip.entity.Contest;
import com.dip.entity.Dog;
import com.dip.entity.DogShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by moneg on 29.12.2016.
 */
public interface DogRepository extends JpaRepository<Dog, Integer> {

    @Query("Select d from Dog d where d.breed.title like %:breed%")
    List<Dog> findByBreedLike(@Param("breed") String breed);

    @Query("Select d from Dog d where d.pedigree like :pedigree")
    Dog findByPedigreeLike(@Param("pedigree") String pedigree);

    @Query("Select d from Dog d where d.breeder.human.Fname like %:fname%")
    List<Dog> findByBreederFnameLike(@Param("fname") String fname);

    @Query("Select d from Dog d where d.breeder.human.Sname like %:sname%")
    List<Dog> findByBreederSnameLike(@Param("sname") String sname);

    @Query("Select d from Dog d where d.breeder.human.Lname like %:lname%")
    List<Dog> findByBreederLnameLike(@Param("lname") String lname);

    @Query("Select a from Ancestry a where a.damName like %:dam%")
    List<Dog> findByDamLike(@Param("dam") String dam);

    @Query("Select d from Dog d where d.gender like %:gender%")
    List<Dog> findByGenderLike(@Param("gender") String gender);

    @Query("Select d from Dog d where d.name like %:name%")
    List<Dog> findByNameLike(@Param("name") String name);

    @Query("Select d from Dog d where d.owner.human.Fname like %:fname%")
    List<Dog> findByOwnerFnameLike(@Param("fname") String fname);

    @Query("Select d from Dog d where d.owner.human.Sname like %:sname%")
    List<Dog> findByOwnerSnameLike(@Param("sname") String sname);

    @Query("Select d from Dog d where d.owner.human.Lname like %:lname%")
    List<Dog> findByOwnerLnameLike(@Param("lname") String lname);

    @Query("Select a from Ancestry a where a.sireName like %:sire%")
    List<Dog> findBySireLike(@Param("sire") String sire);


    List<Dog> findByDogShows(DogShow dogShow);

    List<Dog> findByContests(Contest contest);
}
