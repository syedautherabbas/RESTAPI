package com.mean.services;

import java.util.List;


import com.mean.model.User;

public interface UserService {

	
	public void adduser(User user);
	public void updateuser(User user);
	public User getuser(int id);
	public void deleteuser(int id);
	public List<User> getusers();
	
	
}
