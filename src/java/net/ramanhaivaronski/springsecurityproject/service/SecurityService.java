package net.ramanhaivaronski.springsecurityproject.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
