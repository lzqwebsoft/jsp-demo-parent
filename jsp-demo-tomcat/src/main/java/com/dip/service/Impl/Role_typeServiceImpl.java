package com.dip.service.Impl;

import com.dip.entity.Role_type;
import com.dip.entity.User;
import com.dip.repository.Role_typeRepository;
import com.dip.service.Role_typeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Max on 09.02.2017.
 */
public class Role_typeServiceImpl implements Role_typeService{
    @Autowired
    Role_typeRepository role_typeRepository;

    @Override
    public Role_type addRole(Role_type role_type) {
        return role_typeRepository.saveAndFlush(role_type);
    }

    @Override
    public void delete(int id) {
        role_typeRepository.delete(id);
    }

}
