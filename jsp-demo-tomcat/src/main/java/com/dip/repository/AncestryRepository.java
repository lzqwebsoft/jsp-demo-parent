package com.dip.repository;

import com.dip.entity.Ancestry;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Max on 05.02.2017.
 */
public interface AncestryRepository extends JpaRepository<Ancestry, Integer> {
}
