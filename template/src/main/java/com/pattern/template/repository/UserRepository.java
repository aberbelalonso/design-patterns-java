package com.pattern.template.repository;

import com.pattern.template.model.User;

public interface UserRepository {

    boolean exists(User user);

    void save(User user);
}

