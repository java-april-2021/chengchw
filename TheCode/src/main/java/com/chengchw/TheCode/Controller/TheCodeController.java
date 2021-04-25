package com.chengchw.TheCode.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;

@Controller
public class TheCodeController {

	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";

	}

	@RequestMapping(path = "/code", method = RequestMethod.POST)
	//requestmethod post when user submit form and redirect to code
	public String code(@RequestParam(value = "inputcode") String inputcode, Model model,
			//inputcode will be from user input define in html
			// RequestParam from user input
			RedirectAttributes redirectAttributes) {

		if (inputcode.equals("bushido")) {

			String[] WordList = { "Loyalty", "Courage", "Veracity", "Compassion", "Honor" };
			//list out string to let the html (jsp) print out
			model.addAttribute("List", WordList);
			//apply model to transport the list into jsp
			return "code.jsp";
		}

		else {

			redirectAttributes.addFlashAttribute("errors", "You must train harder");
			
			return "redirect:/";
		}

	}

}
