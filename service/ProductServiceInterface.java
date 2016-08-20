package com.psb.service;

import java.util.List;

import com.psb.model.Product;

public interface ProductServiceInterface {
	
	public void saveOrUpdate(Product product);
	public List<Product> list();
	public Product get(int id);
	public void delete(int id);

}
