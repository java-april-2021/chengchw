package com.chengchw.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
			
	}
	
	@Controller
	public class Greeting{
//		@RequestMapping("/")
//		public String index(Model model) {
//			
//			model.addAttribute("userName","Human");
//			return "index.jsp";
//		}
		
		@RequestMapping("/")
		public String greeting(@RequestParam(defaultValue = "Human",value = "firstName", required = false) String firstName,
							   @RequestParam(value = "lastName", required = false) String lastName,Model model) {
			
//			if (firstName == null) {
//				System.out.println("Hello Human");
//				firstName = "Human!";
//			}
			model.addAttribute("firstName",firstName);
			model.addAttribute("lastName",lastName);
			return "index.jsp";
		}
		
		
		
	}

}
