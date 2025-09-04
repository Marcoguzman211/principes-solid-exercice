package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public class ServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public ServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> sortUsersByUsername(List<User> users) {
        return userRepository.sortUsers(users);
    }

}
