package com.psb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psb.dao.ProductDAO;
import com.psb.model.Product;

@Service
public class ProductService implements ProductServiceInterface {
	@Autowired
	ProductDAO productDAO;
	
	public void saveOrUpdate(Product product)
	{
		productDAO.saveOrUpdate(product);	
	}
	public List<Product> list()
	{
		List<Product> list=productDAO.list();
		return list;
	}
	
	
	public void delete(int id)
	{
		productDAO.delete(id);
	}
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
