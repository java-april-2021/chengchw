package com.chengchw.PlatAssign.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlatAssignController {
	
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String assignmentpage(@PathVariable("chapter") String chapter,@PathVariable("assignmentNumber") String assNum, 
								 Model model) {
		if (chapter == "38") {		
			model.addAttribute("displayContent","Coding Forms");
		}
		else {
			model.addAttribute("displayContent","Fortran to Binary");
		}	
		return "assignment.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0553/{assignmentNumber}")
	public String lessonPage(@PathVariable("chapter") String chapter,@PathVariable("assignmentNumber") String assNum, 
							Model model) {
		
		if (chapter == "38") {		
			model.addAttribute("displayContent","Punch Cards");
		}
		else {
			model.addAttribute("displayContent","Advanced Fortran Intro");
		}
		
		return "lesson.jsp";
	}
	
	
	
	
	@RequestMapping("/m/38/0553/{lesNumber}")
	public String serverpage(Model model, @PathVariable("lesNumber") String num) {
		System.out.println(num);
		model.addAttribute("displayContent","Setting up your servers");
		
		return "lesson.jsp";
	}
	
//	@PostMapping("/m/38/0483/0345")
//	public String codeform(Model model) {
//		
//		model.addAttribute("displayContent","Coding Forms");
//		
//		return "assignment.jsp";
//	}
	
//	@PostMapping("/m/38/0553/0342")
//	public String punchcard(Model model) {
//		
//		model.addAttribute("displayContent","Punch Cards");
//		
//		return "lesson.jsp";
//	}
	
//	@PostMapping("/m/26/0553/0348")
//	public String advancefor(Model model) {
//		
//		model.addAttribute("displayContent","Advanced Fortran Intro");
//		
//		return "lesson.jsp";
//	}
	
//	@PostMapping("/m/26/0483/2342")
//	public String binary(Model model) {
//		
//		model.addAttribute("displayContent","Fortran to Binary");
//		
//		return "assignment.jsp";
//	}
//	

}
