package com.pattern.template.repository;

import com.pattern.template.model.User;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public boolean exists(User user) {
        System.out.println("Checking user existence: " + user);
        return false;
    }

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
    }
}