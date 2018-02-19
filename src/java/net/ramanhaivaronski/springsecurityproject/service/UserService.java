package net.ramanhaivaronski.springsecurityproject.service;


import net.ramanhaivaronski.springsecurityproject.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
