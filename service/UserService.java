package com.psb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psb.dao.UserDAO;
import com.psb.model.User;
@Service
public class UserService implements UserServiceInterface {
	
	@Autowired
	UserDAO	userDAO;
	
	 
	public boolean login(String user,Boolean isAdmin,String pass) 
	{
		return userDAO.login(user,isAdmin,pass);
	}
	public void saveOrUpdate(User user)
	{
		userDAO.saveOrUpdate(user);	
	}
	public List<User> list()
	{
		List<User> list=userDAO.list();
		return list;
	}
	public User getUserById(int id)
	{
		return userDAO.getUserById(id);
	}
	public User getUserByName(String name)
	{
		return userDAO.getUserByName(name);
	}
	public void delete(int id)
	{
		userDAO.delete(id);
	}
	public boolean isAdmin(String name, boolean b, String password) {
		// TODO Auto-generated method stub
		return false;
	}


}
