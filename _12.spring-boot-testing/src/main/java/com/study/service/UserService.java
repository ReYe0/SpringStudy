package com.study.service;

import com.study.entity.User;

public interface UserService extends IService<User>{
    User findByName(String userName);

    void saveUser(User user);
}