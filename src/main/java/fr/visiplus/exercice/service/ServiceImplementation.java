package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public class ServiceImplementation implements IService {

	public String getUsername() throws Exception {
		throw new Exception();
	}

	public List<User> sortUsersByUsername(List<User> users) throws Exception {
		return UserRepository.sortUsers(users);
	}

}
