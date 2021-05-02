package com.chengchw.Language.Controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chengchw.Language.Services.LanguageService;
import com.chengchw.Language.models.Language;

@Controller
public class LanguageController {
	
	private final LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
	
	
	@RequestMapping("/languages")
	public String showLanguages(Model model, @ModelAttribute("inputlanguage") Language inputlanguage) {
		
		List<Language> languages = this.languageService.allLanguages();
		model.addAttribute("languages", languages);
		//model.addAttribute("inputlanguage","apple");
		
		return "languages.jsp";
		
	}
	
	@RequestMapping(path = "/newlanguage", method = RequestMethod.POST)
	public String newLanguages(@Valid @ModelAttribute("inputlanguage") Language inputLanguage, Model model,BindingResult result) {
		List<Language> languages = this.languageService.allLanguages();
		//languages.add(inputLanguage);
		//model.addAttribute("languages", languages);
		
		if(result.hasErrors()) {
    		System.out.println("error");	
    		return "languages.jsp";
		}
		
		else {
			model.addAttribute("languages", languages);
			languages.add(inputLanguage);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/delete")
	public String deleteLanguages(Model model, @ModelAttribute("inputlanguage") Language inputlanguage) {
		
		//model.addAttribute("languages", languages);	
		return "redirect:/languages";
		
	}
	
	@RequestMapping("/languages/{index}")
	public String directlang(@PathVariable("index") int index, Model model) {
		
		System.out.println("oops");
		List<Language> languages = this.languageService.allLanguages();
		Language language = languages.get(index);
		model.addAttribute("language", language);
		
		return "langdetail.jsp";
		
	}
	
	@RequestMapping("/delete/{index}")
	public String deletetlang(@PathVariable("index") int index, Model model) {
		
		System.out.println("delete");
		List<Language> languages = this.languageService.allLanguages();
		Language language = languages.remove(index);
		//model.addAttribute("language", language);
		
		return "redirect:/languages";
		
	}

	
	@RequestMapping("/languages/edit/{index}")
	public String editlangpage(@PathVariable("index") int index, Model model, @ModelAttribute("inputlanguage") Language inputlanguage) {
		
		List<Language> languages = this.languageService.allLanguages();
		Language language = languages.get(index);
		model.addAttribute("language", language);
		//languages.set(index,inputlanguage);
		
		return "/langedit.jsp";		
	}
	
	@RequestMapping("/editlanguage/{index}")
	public String editlang(@PathVariable("index") int index, Model model, @ModelAttribute("inputlanguage") Language inputlanguage) {
		
		List<Language> languages = this.languageService.allLanguages();
		languages.set(index,inputlanguage);
		//model.addAttribute("languages", languages);
		//languages.set(index,inputlanguage);
		
		return "redirect:/languages";	
	}
}
