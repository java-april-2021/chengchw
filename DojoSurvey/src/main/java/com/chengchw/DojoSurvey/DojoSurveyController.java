package com.chengchw.DojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	
	@RequestMapping("/")
	public String main(Model model) {
		
		String[] Location = { "San Jose", "San Fransisco", "Phonex", "Los Angels", "Huston" };
		String[] Language = { "Python", "Java", "C++", "JavaScripts" ,"Ruby"};
		
		model.addAttribute("Location", Location);
		model.addAttribute("Language", Language);
		
		
		return "index.jsp";
	}
	
	@RequestMapping(path = "/formsubmit", method = RequestMethod.POST)
	public String form(Model model, 
					   @RequestParam(value = "username") String Name,
					   @RequestParam(value = "location") String location,
					   @RequestParam(value = "language") String language,
					   @RequestParam(value = "comment") String comment) {
		
		model.addAttribute("usernameAtt", Name);
		model.addAttribute("locationAtt", location);
		model.addAttribute("languageAtt", language);
		model.addAttribute("commentAtt", comment);
		
		System.out.println(comment);
		
		
		return "formpage.jsp";
		
	}
	
	
	
	
}
