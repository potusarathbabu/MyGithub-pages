package com.psb.dao;

import java.util.List;

import com.psb.model.Supplier;


public interface SupplierDAO {
	
	public List<Supplier> list();

	public Supplier get(int id);
	public Supplier getByName(String suppliername) ;

	public void saveOrUpdate(Supplier supplier);

	public void delete(int id);
	
	
	
   
}
