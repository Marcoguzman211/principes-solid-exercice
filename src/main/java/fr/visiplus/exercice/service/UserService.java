package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public interface UserService {

    String getUsername() throws Exception;

    List<User> sortUsersByUsername(List<User> users) throws Exception;
}

