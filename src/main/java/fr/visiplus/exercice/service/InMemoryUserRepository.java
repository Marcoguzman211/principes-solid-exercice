package fr.visiplus.exercice.service;

import java.util.Collections;
import java.util.List;

import fr.visiplus.exercice.User;
import fr.visiplus.exercice.UserComparator;

public class InMemoryUserRepository implements UserRepository {

    @Override
    public List<User> sortUsers(List<User> users) throws Exception {
        Collections.sort(users, new UserComparator());
        return users;
    }
}

