package com.dip.repository;

import com.dip.entity.Human;
import com.dip.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moneg on 29.12.2016.
 */
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

    Owner findByHuman(Human human);
}
