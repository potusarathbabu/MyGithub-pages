package com.psb.dao;

import java.util.List;

import com.psb.model.Category;
import com.psb.model.Supplier;


public interface CategoryDAO {
	
	public List<Category> list();

	public Category get(int id);
	public Category getByName(String categoryname) ;

	public void saveOrUpdate(Category category);

	public void delete(int id);
	
	
   

}
