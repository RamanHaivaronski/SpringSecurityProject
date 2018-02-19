package net.ramanhaivaronski.springsecurityproject.dao;

import net.ramanhaivaronski.springsecurityproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
