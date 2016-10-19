package psb.colloboration.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.Date;
import java.util.List;




import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import psb.colloboration.dao.BlogDAO;

import psb.colloboration.dao.UserDAO;
import psb.colloboration.model.Blog;

@Controller
public class BlogController {
	
	@Autowired
	UserDAO ud;
	
	@Autowired
	BlogDAO bd;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("/goblog") // from user / admin success login page
	public ModelAndView displayBlogPage(){
		System.out.print("\nBlogController - displayBlogPage()");
		ModelAndView mv = new ModelAndView("blog");
	//	session.setAttribute("uname",);
		return mv;
	}
	

	
	@ModelAttribute("blog")
	public Blog returnObject()
	{
		return new Blog();
	}
	
	@RequestMapping("/bpost")
	public String createBlog(@ModelAttribute("blog") Blog blog,Model model,Principal p)throws IOException
	{
		
		//User us= new User();
	//	blog.setBlogCreatedUser(p.getName());
		
		//blog.setCreationdate(new java.util.Date());
		blog.setUsername(p.getName());
		
		blog.setStatus("valid");
		
		blog.setCreationdate(new Date());
		bd.createBlog(blog);
		
		return "blog";
	}
	
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues() {			
		String devs="";
		System.out.println("gson all blogs...");
		List <Blog> listdev = bd.getBlogList();
		Gson gson = new Gson();
		devs=gson.toJson(listdev);	
		return devs;
	}	
	

	

}
