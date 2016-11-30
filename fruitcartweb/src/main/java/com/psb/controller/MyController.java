package com.psb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.psb.model.Product;

@Controller
public class MyController{
	@RequestMapping("/")
	public ModelAndView sarath1(){
		ModelAndView mv1=new ModelAndView("welcome");
		System.out.println("This is welcome Controller");
		return mv1;
	}



	@RequestMapping("/Categories")
	public ModelAndView sarath2(){
		ModelAndView mv2=new ModelAndView("Categories");
		System.out.println("\n This is categories Controller");
		return mv2;
	}
	
	@RequestMapping("/Fruitshub")
	public ModelAndView sarath3(){
		ModelAndView mv3=new ModelAndView("Fruitshub");
		System.out.println("\n This is Fruitshub Controller");
		return mv3;
	}
	
	@RequestMapping("/Vegetableshub")
	public ModelAndView sarath4(){
		ModelAndView mv4=new ModelAndView("Vegetableshub");
		System.out.println("\n This is Vegetables Controller");
		return mv4;
	}
	
	
	@RequestMapping("/Drinkshub")
	public ModelAndView sarath5(){
		ModelAndView mv5=new ModelAndView("Drinkshub");
		System.out.println("\n This is Drinkshub Controller");
		return mv5;
	}
	
	@RequestMapping("/Prices")
	public ModelAndView sarath6(){
		ModelAndView mv6=new ModelAndView("Prices");
		System.out.println("\n This is Prices Controller");
		return mv6;
	}
	
	@RequestMapping("/SpecialOffer")
	public ModelAndView sarath7(){
		ModelAndView mv7=new ModelAndView("SpecialOffer");
		System.out.println("\n This is SpecialOffer Controller");
		return mv7;
	}
	
	
	@RequestMapping("/welcome")
	public ModelAndView sarath10(){
		ModelAndView mv10=new ModelAndView("welcome");
		System.out.println("\n This is welcome Controller");
		return mv10;
	}
	
	@RequestMapping("/FruitCart1")
	public ModelAndView sarath11(){
		ModelAndView mv11=new ModelAndView("FruitCart1");
		System.out.println("\n This is FruitCart1 Controller");
		return mv11;
	}
	@RequestMapping("/aboutus")
	public ModelAndView sarath12(){
		ModelAndView mv12=new ModelAndView("aboutus");
		System.out.println("\n This is aboutus Controller");
		return mv12;
	}
	@RequestMapping("/Adminlogin")
	public ModelAndView sarath13(){
		ModelAndView mv13=new ModelAndView("Adminlogin");
		System.out.println("\n This is Adminlogin Controller");
		return mv13;
	}
	@RequestMapping("/welcome1")
		public ModelAndView sarath14(){
			ModelAndView mv14=new ModelAndView("welcome1");
			System.out.println("\n This is welcome Controller");
			return mv14;
		
	}

	@RequestMapping("/TermsConditions")
	public ModelAndView sarath15(){
		ModelAndView mv15=new ModelAndView("TermsConditions");
		System.out.println("\n This is welcome Controller");
		return mv15;
	
}
	@RequestMapping("/ViewDetails")
	public ModelAndView sarath16(){
		ModelAndView mv16=new ModelAndView("ViewDetails");
		System.out.println("\n This is welcome Controller");
		return mv16;
	
}
	
	}
