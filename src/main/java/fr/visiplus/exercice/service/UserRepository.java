package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

/**
 * Repository abstraction for {@link User} operations.
 */
public interface UserRepository {

    /**
     * Sorts the given list of users using the repository's configured strategy.
     *
     * @param users users to sort
     * @return sorted users
     */
    List<User> sortUsers(List<User> users);
}
