package psb.colloboration.dao;

import java.util.List;

import psb.colloboration.model.User;

public interface UserDAO {

	public List<User> list();

	public User get(int userid);

	public void saveOrUpdate(User user);

	public void delete(int d);

	public User getusername(String username);

	public boolean isvaliduser(String username, String pass, boolean isAdmin);

}
