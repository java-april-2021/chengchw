package com.chengchw.Counter.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	

	@RequestMapping("/")
	public String index(HttpSession session) {
		
		if(session.getAttribute("visitCount") == null) {
			
//			//get and set attribute of the cookie
			session.setAttribute("visitCount", 0);
		}
		
		else {
			
			int updateCount = (int)session.getAttribute("visitCount")+1;
			
			session.setAttribute("visitCount", updateCount);
			
		}
		
		return "your_server.jsp";
		
	}
	
	@RequestMapping("/{ct}")
	
	public String showCounter(HttpSession session, Model model, @PathVariable("ct") String ct) {
		
		
		  if (ct.equals("counter2")) {
		  
		  int updateCount = (int)session.getAttribute("visitCount")+2;
		  //need to cast get attribute from string to int
		  session.setAttribute("visitCount", updateCount); }
		 
		
		
		if ((int)session.getAttribute("visitCount") == 0){
			model.addAttribute("PresentCount",0);
			System.out.println(session.getAttribute("visitCount"));
		}
		
		else {
			
			int Count = (int)session.getAttribute("visitCount");
			model.addAttribute("PresentCount",Count);
		}
		
		return "your_sever_counter.jsp";
		
	}
	
	@PostMapping("/resetCounter")
	public String resetCounter(HttpSession session) {
		
		session.setAttribute("visitCount", 0);
		return "redirect:/counter";
		//redirect syntex
	}
}
