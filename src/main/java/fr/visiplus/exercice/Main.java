package fr.visiplus.exercice;

import java.util.ArrayList;
import java.util.List;

import fr.visiplus.exercice.service.ServiceImplementation;
import fr.visiplus.exercice.service.UserService;

public class Main {

        public static void main(String[] args) {

                UserService service = new ServiceImplementation();

                List<User> list = new ArrayList<User>();
                list.add(new User("albert", "martin", "martina", "noidea"));
                list.add(new User("gerard", "charles", "charlesg", "idea"));

                service.sortUsersByUsername(list).forEach(System.out::println);

        }

}
