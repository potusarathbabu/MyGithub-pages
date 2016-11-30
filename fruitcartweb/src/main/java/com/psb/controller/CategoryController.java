package com.psb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.psb.model.Category;
import com.psb.service.CategoryService;
@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	Category category;
	
	
	@RequestMapping("/Ad")
	public ModelAndView psbcontroller()
	{
		
		ModelAndView mv=new ModelAndView("ManageCategory");
	System.out.println("Suppliers controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/mycategory")
	public ModelAndView Registercontroller( @ModelAttribute Category sc,
			
			@RequestParam(value = "categoryname") String categoryname,
			@RequestParam(value = "description") String description)
	
	{
		

		
		
		sc.setCategoryname(categoryname);
		sc.setDescription(description);
		System.out.println(sc.getCategoryname());
		categoryService.saveOrUpdate(sc);

		ModelAndView mv=new ModelAndView("ManageCategory");
	System.out.println("Supplier controller called");
		
		
		return mv;
	}

}
