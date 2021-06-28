package com.section1.ControllersAndViews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.section1.ControllersAndViews.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmail(String email);
}