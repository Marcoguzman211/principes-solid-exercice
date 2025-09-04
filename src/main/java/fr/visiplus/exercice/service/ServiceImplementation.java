package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public class ServiceImplementation implements UserService {

        @Override
        public List<User> sortUsersByUsername(List<User> users) {
                return UserRepository.sortUsers(users);
        }

}
