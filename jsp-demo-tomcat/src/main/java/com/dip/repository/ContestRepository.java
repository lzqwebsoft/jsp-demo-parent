package com.dip.repository;

import com.dip.entity.Contest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moneg on 29.12.2016.
 */
public interface ContestRepository extends JpaRepository<Contest, Integer> {
}
