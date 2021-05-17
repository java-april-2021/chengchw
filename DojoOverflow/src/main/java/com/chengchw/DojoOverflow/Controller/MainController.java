package com.chengchw.DojoOverflow.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chengchw.DojoOverflow.Model.*;
import com.chengchw.DojoOverflow.Service.AnswerService;
import com.chengchw.DojoOverflow.Service.QuestionService;
import com.chengchw.DojoOverflow.Service.TagService;




@Controller 
@RequestMapping("/questions")
public class MainController {
	
	private final AnswerService ansSer;
	private final QuestionService queSer;
	private final TagService tagSer;
	
	public MainController(AnswerService ansSer,QuestionService queSer,TagService tagSer) {
		this.ansSer = ansSer;
		this.queSer = queSer;
		this.tagSer = tagSer;
	}
	
	@GetMapping("/")
	public String DashBoard(Model model) { 
		
			List<Question> allQuestions = this.queSer.getallquestions();
			model.addAttribute("showquestion", allQuestions);
					
		
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String NewQuestionPage(@ModelAttribute("blankquestion") Question blankquestion) {
		
	
		return "newquestion.jsp";
	}
	
	
	
	@PostMapping("/new")
	public String CreateQuestion(@RequestParam("inputtag") String inputtag, 
								 @ModelAttribute("blankquestion") Question blankquestion,
								 RedirectAttributes redirectAttributes) {
		
		String [] taglst = inputtag.split(",");
		List<String> tagarr = new ArrayList<String>();
		tagarr = Arrays.asList(taglst);
		//System.out.println(blankquestion.getQuestion());
		if(tagarr.size() > 3) {
			
			redirectAttributes.addFlashAttribute("error", "Please add less than three tag");
			return "redirect:/questions/new";
		}
		
		else {
			this.queSer.setquestion(blankquestion);
			List<Tag> setTagArr = new ArrayList<Tag>();
			for (int i = 0; i < tagarr.size(); i++) {
				//System.out.println("abcd");
				Tag newTag = new Tag(tagarr.get(i));
				//System.out.println("efgh");
				newTag.setSingleQuestion(blankquestion);
				
				//System.out.println(blankquestion.getQuestion());
				this.tagSer.saveTag(newTag);
				setTagArr.add(newTag);
			}
			
			//System.out.println(setTagArr);
			blankquestion.setTags(setTagArr);
			System.out.println(blankquestion.getTagsString());
			
			return "redirect:/questions/";
		}
			
			
	}
	
	
	

	@GetMapping("/{questionid}")
	public String AnswerPage(@PathVariable(value = "questionid") Long questionid, Model model) {
		
		Question question = this.queSer.findquestionbyid(questionid);
		List<Answer> allAnswers = question.getAnswers();
		List<Tag> allTags = question.getTags();
		model.addAttribute("showquestion", question);
		model.addAttribute("showtag",allTags);
		model.addAttribute("showanswer", allAnswers);
		
		return "answerpage.jsp";
	}
	
	@PostMapping("addanswer")
	public String attachanswer(@RequestParam("questionid") Long queId, @RequestParam("inpuanswer") String inputanswer) {
		
		System.out.println(queId);
		System.out.println(inputanswer);
		Answer inputans = new Answer(inputanswer);
		Question selectquestion = this.queSer.findquestionbyid(queId);
		inputans.setQuestion(selectquestion);
		this.ansSer.updateAns(inputans);
		return "redirect:/questions/"+ queId ;
	}
	
	
}
