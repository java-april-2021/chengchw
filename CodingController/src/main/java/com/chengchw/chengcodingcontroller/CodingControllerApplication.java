package com.chengchw.chengcodingcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication


public class CodingControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingControllerApplication.class, args);	
	}
	
	@RestController
	@RequestMapping("/coding")
	public class CodingController{
	
		@RequestMapping("")
		public String hello() {
			
			return "Hello Coding Dojo!";
		}
		
		@RequestMapping("/python")
		public String python() {
			
			return "Python/Django was awesome!";
		}
		
		@RequestMapping("/java")
		public String java() {
			
			return "Java/Spring is better!";
		}
	
	}
	
	@RestController
//	@RequestMapping("/dojo")
	public class DojoController{
		
		@RequestMapping("/dojo")
//		@RequestMapping("")
		public String hello() {
			
			return "The dojo is awesome!";
		}
		
		@RequestMapping("/dojo/{location}")
		public String burbank(@PathVariable String location) {
			
			String ShowContent = new String();	
			System.out.println(location);
			if (location.equals("san-jose")){
				
				ShowContent = "SJ dojo is the headquarters";
//				System.out.println("Here");
			}
			
			else {
//				System.out.println(location);
				ShowContent = "Burbank Dojo is located in Southern California";
//				System.out.println("Nowhere");
			}
			
			return ShowContent;
		
		
		}
	}
}	


