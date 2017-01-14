package com.dip.repository;

import com.dip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moneg on 08.01.2017.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
