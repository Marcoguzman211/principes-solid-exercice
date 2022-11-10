package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public interface IService {

	public String getUsername() throws Exception;
	
	public List<User> sortUsersByUsername(List<User> users) throws Exception;	
	
	
}
