package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

/**
 * Service dealing with {@link User} operations.
 */
public interface UserService {

    /**
     * Sorts the given list of users by their username.
     *
     * @param users the users to sort
     * @return a list of users sorted by username
     */
    List<User> sortUsersByUsername(List<User> users);
}

