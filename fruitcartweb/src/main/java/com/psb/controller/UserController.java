package com.psb.controller;


import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.psb.model.Product;
import com.psb.model.User;
import com.psb.service.ProductService;
import com.psb.service.UserService;



@Controller
public class UserController {
	@Autowired
	private ProductService productService;
	
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
	public ModelAndView register(@Valid@ModelAttribute("user") User user,BindingResult bindingResult,ModelMap model)
    {	
		if(bindingResult.hasErrors())
		{
			return new ModelAndView("signup");
		}
		ModelAndView mv;
		System.out.println("in signup controller");
		if(user.getPassword().equals(user.getConfirmpassword()))
		{
		ps.saveOrUpdate(user);
		
	mv = new ModelAndView("Signin");
		return mv;
		}
		else
		{
			model.addAttribute("message","both passwords are not matching");
			mv=new ModelAndView("signup");
			return mv;
		}
	}
	
	/*@RequestMapping("/myUCheck")
	public ModelAndView usercheck(Principal principal){
		ModelAndView mv =  new ModelAndView("FruitCart1");
		String name = principal.getName();
		mv.addObject(name, "name");
		
		System.out.println("it is of myusercheck");
		return mv;
	}
	@RequestMapping("/myACheck")
	public ModelAndView admincheck(Principal principal){
		System.out.println("it is of myadmincheck");
		return new ModelAndView("Adminlogin");
	}
	@RequestMapping("/Logout")
	public String logout(HttpServletRequest request){
		request.getSession().invalidate();
		System.out.println("Logout page called in Usercontroller");
		return "Logout";
		
	}*/
	

	@RequestMapping("/Payment")
	public ModelAndView MyCard(){
		ModelAndView mv16=new ModelAndView("Payment");
		System.out.println("\n This is Cartr");
		return mv16;
	
}
	@RequestMapping("/CashonDelivary")
	public ModelAndView MyCash(){
		ModelAndView mv16=new ModelAndView("CashonDelivary");
		System.out.println("\n This is Cash");
		return mv16;
	
}
/*	@RequestMapping("/myUCheck")
	public ModelAndView customerCheck(ModelMap model,Principal principal)
	{
		System.out.println("in user");
		String name=principal.getName();
		System.out.println("name:"+name);
		model.addAttribute("username",name);
		model.addAttribute("message","spring security custom example");
		List<Product> product=productService.list();
		String jsonData="";
		ObjectMapper mapper=new ObjectMapper();
		try {
			jsonData=mapper.writeValueAsString(product);
			System.out.println(jsonData);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("FruitCart1","products",jsonData);
	}*/
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/login_session_attributes")
	public String login_session_attributes(HttpSession session,ModelMap model) {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
	session.setAttribute("username", name);
    	session.setAttribute("LoggedIn", "true");

		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
		.getAuthentication().getAuthorities();
		String role="ROLE_USER";
		for (GrantedAuthority authority : authorities) 
		{
		  
		     if (authority.getAuthority().equals(role)) 
		     {
		    	 session.setAttribute("UserLoggedIn", "true");
		    
		    	 return "FruitCart1";
		     }
		     else 
		     {
		    	 session.setAttribute("Administrator", "true");
	
			 }
		}
		return "Adminlogin";
	}
	
	@RequestMapping("/out")
	public ModelAndView doout(){
		ModelAndView mv=new ModelAndView("welcome");
		return mv;
	}

}
