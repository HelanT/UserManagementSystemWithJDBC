package com.takeo.dao;

import java.util.List;


import com.takeo.model.User;

public interface UserDAO {
	
	public String register(User user);
	
	public List<User> viewRegister();
	
	public boolean verifyEmailAndPassword(String email, String pass);
	
	

}
