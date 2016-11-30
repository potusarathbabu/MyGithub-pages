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

import com.psb.model.Product;
import com.psb.model.User;
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAOImpl(){}
	public ProductDAOImpl(SessionFactory sf){
		sessionFactory=sf;
	}
@Transactional
	public List<Product> list() {
		
	Session s = sessionFactory.getCurrentSession();
	Transaction tx = s.beginTransaction();
	List<Product> list = s.createCriteria(Product.class).list();
	return list;

		
	}

	

	@Transactional
     public void saveOrUpdate(Product pd) {
		
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("User dao impl" +  pd);
		s.saveOrUpdate(pd);
		t.commit();	

		/*	System.out.println("In product DAOImpl");
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().saveOrUpdate(product);		
		t.commit();		*/
	}
	

	
	
	
	@Transactional
	public void delete(int id) {
	System.out.println("Id in deleteProduct(int id):"+id);

	    Session session=sessionFactory.getCurrentSession();
	    Transaction tx=session.beginTransaction();
	    Product product = (Product)session.load(Product.class, id);
	   // Query query=session.createQuery("delete from product  where id=:status");
	   // query.setInteger("status",id);
	   // int rowsDeleted=query.executeUpdate();
	    session.delete(product);
	    tx.commit();
	 //   System.out.println("Rows deleted:"+rowsDeleted);
	    System.out.println("deleted");


	}
	
	
	public Product get (int id){
        Session session = sessionFactory.getCurrentSession();
	    Transaction tx=session.beginTransaction();

        Product product = (Product) session.get(Product.class, id);
	    tx.commit();

      

        return product;
    }
	public void editProduct (Product product){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

}
