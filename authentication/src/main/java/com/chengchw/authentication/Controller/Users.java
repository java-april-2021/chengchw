package com.chengchw.authentication.Controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chengchw.authentication.Model.User;
import com.chengchw.authentication.Service.UserService;
import com.chengchw.authentication.Validator.UserValidator;

@Controller
public class Users {

	private final UserService userSer;
	private  UserValidator useVal;
	
	public Users(UserService userSer, UserValidator useVal) {
		
		this.userSer = userSer;
		this.useVal = useVal;
	}
	
	@RequestMapping("/registration")
	public String registerForm(@ModelAttribute("user") User user) {
		
		return "registrationPage.jsp";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "loginPage.jsp";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session,RedirectAttributes redirectAttributes) {
//		System.out.println(user.getPassword());
//		System.out.println(user.getPasswordConfirmation());	
//		System.out.println(user.getPassword() == user.getPasswordConfirmation());
		
			this.useVal.validate(user, result);
			if(result.hasErrors()) {
				//|| user.getPassword() != user.getPasswordConfirmation()
//				System.out.println(user.getPassword());
//				System.out.println(user.getPasswordConfirmation());
				System.out.println("error");
				redirectAttributes.addFlashAttribute("errormessage", "Please enter valid email");
				return "redirect:/registration";
			}
			
			else {
				
				this.userSer.registerUser(user);
				session.setAttribute("theuser", user.getId());
				//session.invalidate();
				System.out.println("success");
				
				return  "loginPage.jsp";
			}
			
		
			
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session,RedirectAttributes redirectAttributes){
		
		if(this.userSer.authenticateUser(email, password)) {
			
			User theuser = this.userSer.findByEmail(email);
			model.addAttribute("user",theuser);
			session.setAttribute("theuser", theuser.getId());
			return "redirect:/home";
		}
		
		else {
			
			redirectAttributes.addFlashAttribute("errormessage", "Please enter valid email");
			
			return "redirect:/login";
		}
		
	}
	
	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
		
		Long userid = (Long)session.getAttribute("theuser");
		User theUser = this.userSer.findUserById(userid);
		model.addAttribute("user", theUser);
		 
		return "homePage.jsp";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "loginPage.jsp";
	}
}
