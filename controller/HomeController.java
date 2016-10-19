package psb.colloboration.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import psb.colloboration.dao.UserDAO;
import psb.colloboration.model.User;

@Controller
public class HomeController {
	

	@Autowired
	UserDAO ps;
	@RequestMapping("/")
	public ModelAndView sarath1() {
		ModelAndView mv1 = new ModelAndView("Welcome1");
		System.out.println("This is welcome Controller");
		return mv1;

	}
	@RequestMapping("/Welcome")
	public ModelAndView sarath2() {
		ModelAndView mv1 = new ModelAndView("Welcome");
		System.out.println("This is welcome Controller");
		return mv1;

	}
	@RequestMapping("/TermsConditions")
	public ModelAndView sarath15(){
		ModelAndView mv15=new ModelAndView("TermsConditions");
		System.out.println("\n This is Terms and Condtions Controller");
		return mv15;
	}

	

	@RequestMapping("/signin")
	public ModelAndView Logicontroller() {
		ModelAndView mv = new ModelAndView("signin");
		System.out.println("Registration control called");

		return mv;
	}
	@ModelAttribute
	public Object returnuser(){
		return new User();
	}
	@RequestMapping("/signup")
	public ModelAndView Logicontroller1() {
		ModelAndView mv = new ModelAndView("signup","user",new User());
		System.out.println("Registration control called");

		return mv;
	}
	
	@RequestMapping("/do_out")
	public ModelAndView LogoutController() {
		ModelAndView mv = new ModelAndView("signin");
		System.out.println("Registration control called");

		return mv;
	
	
	}
	
	
	
	
	

	 @RequestMapping("/register")
		public String createUser(@ModelAttribute("user") User user,@RequestParam("img") MultipartFile file,Model model,HttpServletRequest request)throws IOException
		{
		 	String filename;
		 	byte[]bytes;
		 	
		 			 user.setRole("ROLE_USER");
		 			 user.setAuthority("ROLE_USER");
		 			 user.setEnabled(true);
		 			ps.saveOrUpdate(user);
		 			System.out.println("image");
		 			MultipartFile image=user.getImg();
		 			Path path;
		 			path=Paths.get("N://chatproject//chatproject//src//main//webapp//resources//images//"+user.getUserid()+".jpg");
		 			//String path = request.getSession().getServletContext().getRealPath("/resources/images/" + user.getUser_id() + ".jpg");
		            System.out.println("Path = " + path);
		            System.out.println("File name = " + user.getImg().getOriginalFilename());
		           /* File f = new File(path);
		            BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
		            bs.write(bytes);
		            bs.close();
		            System.out.println("Picture uploaded");
		        } catch (Exception ex) {
		            System.out.println(ex.getMessage());
		        }*/
		            if(image!=null && !image.isEmpty())
		            {
		            	try
		            	{
		            	   image.transferTo(new File(path.toString()));
		            	   System.out.println("Image Saved in:"+path.toString());
		            	}catch(Exception e)
		            	{
		            		e.printStackTrace();
		            		System.out.println("Image not saved");
		            	}
		            }
			return "signin";
		}
	 
	 @RequestMapping(value = "/login_session_attributes")
		public String login_session_attributes(HttpSession session,ModelMap model) {
			String name = SecurityContextHolder.getContext().getAuthentication().getName();
			System.out.println("1");
			
			//User user = userService.getUserByName(name);
			
			System.out.println("2");
			
			//session.setAttribute("userId", user.getId());
			System.out.println("3");
			
		session.setAttribute("username",name);
			
		session.setAttribute("LoggedIn", "true");

			@SuppressWarnings("unchecked")
			Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
			.getAuthentication().getAuthorities();
			
			String role="ROLE_USER";
			for (GrantedAuthority authority : authorities) 
			{
			  
			     if (authority.getAuthority().equals(role)) 
			     {
			    	 
			 
			    	System.out.println("success user login");
			    	return "Welcome";
			     
			     }
			     
			    

			}
			return "Welcome1";


}
	 

}
