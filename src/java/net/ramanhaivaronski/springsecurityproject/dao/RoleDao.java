package net.ramanhaivaronski.springsecurityproject.dao;

import net.ramanhaivaronski.springsecurityproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}