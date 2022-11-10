package fr.visiplus.exercice;

import java.util.ArrayList;
import java.util.List;

import fr.visiplus.exercice.service.ServiceImplementation;

public class Main {

	public static void main(String[] args) throws Exception {

		ServiceImplementation s = new ServiceImplementation();
		
		List<User> list = new ArrayList<User>();
		list.add(new User("albert", "martin", "martina", "noidea"));
		list.add(new User("gerard", "charles", "charlesg", "idea"));

		s.sortUsersByUsername(list).forEach(System.out::println);

	}

}
