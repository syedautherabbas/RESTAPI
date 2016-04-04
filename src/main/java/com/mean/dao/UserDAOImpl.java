package com.mean.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mean.model.User;
@Repository
public class UserDAOImpl implements UserDAO {

	
	public UserDAOImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("USERDAOIMPL");
	}
	

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void adduser(User user) {
		// TODO Auto-generated method stub
		getCurrentSession().save(user);
		
	}

	@Override
	public void updateuser(User user) {
		// TODO Auto-generated method stub
		getCurrentSession().update(user);
		
	}

	@Override
	public User getuser(int id) {

		return (User)getCurrentSession().get(User.class, id);
	}

	@Override
	public void deleteuser(int id) {

		// TODO Auto-generated method stub
		if(getuser(id)!=null)
		getCurrentSession().delete(getuser(id));
	}

	@Override
	public List<User> getusers() {
		// TODO Auto-generated method stub
		System.out.println("getting all users in userdao ijmpl");
		return getCurrentSession().createQuery("from users").list();
	}

}
