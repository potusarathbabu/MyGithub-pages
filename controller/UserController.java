package com.psb.controller;


import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.psb.model.User;
import com.psb.service.UserService;



@Controller
public class UserController {
	@Autowired
	UserService ps;
		
	@RequestMapping("/signup")
	public ModelAndView displayReg(){
		ModelAndView r1=new ModelAndView("signup","user",new User());
		System.out.println("reg page is from logicontroller");
		return r1;
	}
	

	@RequestMapping("/Signin")
	public ModelAndView Logicontroller()
	{
		ModelAndView mv= new ModelAndView("Signin");
		System.out.println("Registration control called");
		
		
		return mv;
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@Valid@ModelAttribute("user") User user,BindingResult bindingResult)
    {	
		if(bindingResult.hasErrors())
		{
			return new ModelAndView("signup");
		}
		System.out.println("in signup controller");
		
		ps.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("Signin");
		return mv;
	}
	
	@RequestMapping("/myUCheck")
	public ModelAndView usercheck(Principal principal){
		System.out.println("it is of myusercheck");
		return new ModelAndView("FruitCart1");
	}
	@RequestMapping("/myACheck")
	public ModelAndView admincheck(Principal principal){
		System.out.println("it is of myadmincheck");
		return new ModelAndView("Adminlogin");
	}
	@RequestMapping("/Logout")
	public ModelAndView logout(Principal principal,HttpSession session){
		session.invalidate();
		return new ModelAndView("Logout");
		
	}
	
    
}
