package com.iparhan.blog.service;

import com.iparhan.blog.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
