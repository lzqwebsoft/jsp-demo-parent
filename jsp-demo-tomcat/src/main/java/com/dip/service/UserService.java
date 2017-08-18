package com.dip.service;

import com.dip.entity.User;

import java.util.List;

/**
 * Created by moneg on 08.01.2017.
 */
public interface UserService {
    User save(User user);
    User findByEmail(String email);
    List<User> findAll();
    void delete(int id);
    User findByUsername(String username);
}
