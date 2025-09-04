package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public class ServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public ServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUsername() throws Exception {
        throw new Exception();
    }

    public List<User> sortUsersByUsername(List<User> users) throws Exception {
        return userRepository.sortUsers(users);
    }
}

