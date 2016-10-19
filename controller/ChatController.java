package psb.colloboration.controller;




import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import psb.colloboration.model.Message;
import psb.colloboration.model.OutputMessage;



@Controller
public class ChatController {
	

	

	@RequestMapping("/getchat")
	public ModelAndView displaychat(){
		ModelAndView r1=new ModelAndView("chat");
		System.out.println("log page is from logicontroller");
		return r1;
	}
	
	  @MessageMapping("/chat")
	  @SendTo("/topic/message")
	  public OutputMessage sendMessage(Message message) {
	    return new OutputMessage(message, new Date());
	  }
	


}
