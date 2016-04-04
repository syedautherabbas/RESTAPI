package com.mean.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mean.dao.UserDAO;
import com.mean.dao.UserDAOImpl;
import com.mean.model.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {   
	
	
	
	
	private UserDAO userDAO;
	
	
	
	
	 public UserServiceImpl() {
	System.out.println("LSIMPL@@@@@@@@@@@@@@@CONSTRUCTION");
	}
	
	@Override
	public void adduser(User user) {
		userDAO.adduser(user);
		
	}

	@Override
	public void updateuser(User user) {
		// TODO Auto-generated method stub
		userDAO.updateuser(user);
		
	}

	@Override
	public User getuser(int id) {
		// TODO Auto-generated method stub
		return userDAO.getuser(id);
	}

	@Override
	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		userDAO.deleteuser(id);
	}

	@Override
	public List<User> getusers() {
		// TODO Auto-generated method stub
		System.out.println("getting all users in logserviceimpl");
		return userDAO.getusers();
	}

}
