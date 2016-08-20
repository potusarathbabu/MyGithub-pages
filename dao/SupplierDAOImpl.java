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

import com.psb.model.Supplier;


@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;


	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}

    @Transactional
	public List<Supplier> list() {
    	List<Supplier> listSupplier = (List<Supplier>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listSupplier;
	}

	@Transactional
	public Supplier get(int id) {
		String hql = "from Supplier where id=" + "'"+ id +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>) query.list();
		
		if (listSupplier != null && !listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(Supplier supplier) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();

		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		System.out.println("In supplierDAOImpl");
		t.commit();

	}

	@Transactional
	public void delete(int id) {
		Supplier supplier=new Supplier();
		supplier.setId(id);
		sessionFactory.getCurrentSession().delete(supplier);		
	}
	
	
	@Transactional
	public Supplier getSupplierByName(String suppliername) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		Supplier supplier=(Supplier) session.get(Supplier.class,suppliername);
		System.out.println("data of supplier by name="+supplier);
		return supplier;	


	}

	@Transactional
     public boolean isValidCredentials(String supplier,Boolean isAdmin, String pass) {
		
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		String hql = "from Supplier where id= '" + supplier + "' and password = '" + pass + "'";
		//String hql = "from Supplier where id= '" + supplier + "' and " + " spassword ='" + pass+"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List list = q.list();
		System.out.println("supplierDAOImpl");
		t.commit();
		
		
		
		if(list == null || list.isEmpty())
		{
			return false;
		}
		
		else
		{
			return true;
		}
		
		
		
	}
	
}



