package com.psb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.psb.model.User;
import com.psb.model.UserRole;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO  {
	@Autowired
	private SessionFactory sessionFactory;


	public UserDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<User> list() {
		
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return list;
	}

	@Transactional
	public void saveOrUpdate(User user) {
				Session session=sessionFactory.getCurrentSession();
				Transaction tx=session.beginTransaction();
				user.setEnabled(true);
				session.save(user);
				UserRole userRole=new UserRole();
				userRole.setId(user.getId());
				userRole.setAuthority("ROLE_USER");
				session.save(userRole);
				System.out.println("Done saving user");
				tx.commit();
	
	}
	public User getUserById(int id) {
		
		Session session=this.sessionFactory.getCurrentSession();
		User user=(User) session.load(User.class,id);
		System.out.println("data of user by id="+user);
		return user;	

	}
	public User getUserByName(String name) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		User user=(User) session.get(User.class,name);
		System.out.println("data of user by name="+user);
		return user;	

	}
	
	@Transactional
	public void delete(int id) {
		User user = new User();
		
		sessionFactory.getCurrentSession().delete(user);
		System.out.println("Deleting the User");
	}
	public boolean login(String user,Boolean isAdmin, String pass) {
		String hql="from user where id='" + user + "' and password ='" + pass +"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List list=q.list();
		if(list==null || list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;	
		}
		}
		
	





	
	}