package com.mean.dao;

import java.util.List;

import com.mean.model.User;

public interface UserDAO {
	
	public void adduser(User user);
	public void updateuser(User user);
	public User getuser(int id);
	public void deleteuser(int id);
	public List<User> getusers();
}
