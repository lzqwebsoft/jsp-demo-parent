package com.dip.repository;

import com.dip.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moneg on 24.01.2017.
 */
public interface HumanRepository extends JpaRepository<Human, Integer> {
}
