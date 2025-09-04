package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public interface UserRepository {
    List<User> sortUsers(List<User> users) throws Exception;
}

