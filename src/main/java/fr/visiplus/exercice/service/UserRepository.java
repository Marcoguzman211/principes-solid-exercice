package fr.visiplus.exercice.service;

import java.util.Collections;
import java.util.List;

import fr.visiplus.exercice.User;
import fr.visiplus.exercice.UserComparator;

public class UserRepository {

        public static List<User> sortUsers(List<User> users) {
                Collections.sort(users, new UserComparator());
                return users;
        }

}
