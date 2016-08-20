package com.psb.dao;

import java.util.List;



import com.psb.model.User;


public interface UserDAO {
	
	public List<User> list();
	
	public void saveOrUpdate(User user);
	
	public User getUserById(int id);
	
	public User getUserByName(String name);
	
	public void delete(int id);

	public boolean login(String user,Boolean isAdmin, String pass);

}
