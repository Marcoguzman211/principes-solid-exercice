package fr.visiplus.exercice.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.visiplus.exercice.User;

/**
 * In-memory implementation of {@link UserRepository}.
 */
public class InMemoryUserRepository implements UserRepository {

    private final Comparator<User> comparator;

    public InMemoryUserRepository(Comparator<User> comparator) {
        this.comparator = comparator;
    }

    @Override
    public List<User> sortUsers(List<User> users) {
        Collections.sort(users, comparator);
        return users;
    }
}
