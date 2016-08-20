package com.psb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.psb.model.Supplier;
import com.psb.service.SupplierService;
@Controller
public class SupplierController {
	@Autowired
	SupplierService supplierService;
	Supplier supplier;
	
	
	@RequestMapping("/Addd")
	public ModelAndView  psb1controller()
	{
		
		ModelAndView mv=new ModelAndView("ManageSupplier");
	System.out.println("Suppliers controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/mysupplier")
	public ModelAndView Registercontroller( @ModelAttribute Supplier supplier,
			
			@RequestParam(value = "suppliername") String suppliername,
			@RequestParam(value = "quantity") int quantity,
			@RequestParam(value = "mobilenumber") String mobilenumber,
			@RequestParam(value = "email") String email)
	
	{
		

		Supplier s=new Supplier();
		//supplier.setId(supplierid);
		s.setSuppliername(suppliername);
		s.setQuantity(quantity);

		s.setMobilenumber(mobilenumber);
		
		s.setEmail(email);
		System.out.println(s.getSuppliername());
		supplierService.saveOrUpdate(s);

		ModelAndView mv=new ModelAndView("ManageSupplier");
	System.out.println("Supplier controller called");
		
		
		return mv;
	}
	
	
	
	
}
