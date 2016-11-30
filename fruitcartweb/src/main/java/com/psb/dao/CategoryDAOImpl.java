package com.psb.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.psb.model.Category;
import com.psb.model.Supplier;
import com.psb.dao.CategoryDAO;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;


	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}

	
	@Transactional
	public Category getByName(String categoryname) {

	   String hql = "from Category where categoryname=" + "'"+ categoryname +"'";

	    Query query = (Query) sessionFactory.openSession().createQuery(hql);
	    List<Category> listCategory = (List<Category>)  query.list();
	    
	    if  (listCategory != null && !listCategory.isEmpty()){
	        return listCategory.get(0);
	        
	    }
	    return null;
	
	}
	
	
	
	
	
    @Transactional
	public List<Category> list() {
    	List<Category> listCategory = (List<Category>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}

	@Transactional
	public Category get(int id) {
		String hql = "from Category where id=" + "'"+ id +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();
		
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(Category category) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();

		sessionFactory.getCurrentSession().saveOrUpdate(category);
		System.out.println("In categoryDAOImpl");
		t.commit();

	}

	@Transactional
	public void delete(int id) {
		Category category=new Category();
		category.setId(id);
		sessionFactory.getCurrentSession().delete(category);		
	}
	
	

	
}
