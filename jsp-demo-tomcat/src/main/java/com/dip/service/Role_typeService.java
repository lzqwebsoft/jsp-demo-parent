package com.dip.service;

import com.dip.entity.Role_type;
import com.dip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Max on 09.02.2017.
 */
public interface Role_typeService {
    Role_type addRole(Role_type role_type);
    void delete(int id);
}
