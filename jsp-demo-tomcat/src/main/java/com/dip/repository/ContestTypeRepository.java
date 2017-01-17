package com.dip.repository;

import com.dip.entity.ContestType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ContestTypeRepository extends JpaRepository<ContestType, Integer> {
}
