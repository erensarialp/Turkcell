package com.turkcell.app.repository;


import com.turkcell.app.entity.User;

import java.util.List;

//Imzalari tanimla.
public interface BaseUserRepository {

    List<User> findAll();
    User findById(int id);
    void save(User user);
}
