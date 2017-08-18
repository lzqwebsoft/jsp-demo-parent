package com.dip.repository;

import com.dip.entity.DogShow;
import com.dip.entity.Role_type;
import com.dip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Max on 09.02.2017.
 */
@Repository
public interface Role_typeRepository extends JpaRepository<Role_type, Integer> {
}
