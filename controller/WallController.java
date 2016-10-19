package psb.colloboration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import psb.colloboration.model.User;
@Controller
public class WallController {

	
	@RequestMapping("/Wall")
	public ModelAndView wallmethod(){
		ModelAndView r1=new ModelAndView("Wall","user",new User());
		System.out.println("reg page is from logicontroller");
		return r1;
	}
	
	
	
}
