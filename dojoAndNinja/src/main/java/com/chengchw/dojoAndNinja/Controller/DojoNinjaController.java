package com.chengchw.dojoAndNinja.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chengchw.dojoAndNinja.Model.Dojo;
import com.chengchw.dojoAndNinja.Model.Ninja;
import com.chengchw.dojoAndNinja.Service.DojoService;
import com.chengchw.dojoAndNinja.Service.NinjaService;

@Controller
public class DojoNinjaController {
	
	private final DojoService dojoSer;
	private final NinjaService ninjaSer;
	
	public DojoNinjaController(DojoService dojoSer,NinjaService ninjaSer) {
		
		this.dojoSer = dojoSer;
		this.ninjaSer = ninjaSer;
	}
	
	@RequestMapping("/dojos/new")
	public String index(Model model) {
		
		List<Dojo> allDojo = this.dojoSer.getAllDojo();
		
		model.addAttribute("allDojos", allDojo);
		
		return "index.jsp";
	}
	
	@PostMapping("/createdojo")
	public String createdojo(@RequestParam("dojoname") String dojoname) {
		
		if(dojoname.isEmpty()) {
			
			System.out.println("blank");
			return "redirect:/dojos/new";
			
		}
		
		Dojo newdojo = new Dojo(dojoname);
		this.dojoSer.ceateDojo(newdojo);
		
		return "redirect:/dojos/new";
	}
	
	@RequestMapping("/ninjas/new")
	public String directToCreateNinja(@ModelAttribute("blankNinja") Ninja blankNinja, Model model) {
		
		List<Dojo> totalDojos = this.dojoSer.getAllDojo();
		model.addAttribute("allDojos", totalDojos);
		
		
		return "createNinjaPage.jsp";
	}
	
	@PostMapping("/createninja")
	public String createNinja(@ModelAttribute("blankNinja") Ninja blankNinja) {
		
		if(blankNinja.getAge() == 0 || blankNinja.getLast_name().isEmpty() ||blankNinja.getFirst_name().isEmpty()) {
			System.out.println("Fail To Create");
			
			return "redirect:/ninjas/new";
					
		}
		
		System.out.println("Success");
		this.ninjaSer.createNinja(blankNinja);
		Dojo dojofill = blankNinja.getDojo();
		dojofill.setNinja(blankNinja);
		
		return "redirect:/ninjas/new";
		
	}
	
	@PostMapping("/viewninjalist")
	public String directToViewNinja(@RequestParam("dojositeid") Long dojoId, Model model) {
		
		Dojo dojosite = this.dojoSer.getDojoById(dojoId);
		List<Ninja> allNinjas = dojosite.getNinjas();
		model.addAttribute("vieAllNinjas",allNinjas);
		System.out.println("dojo/"+ dojoId);
		
		return "redirect:/dojo/"+ dojoId ;
		
	}
	
	
	 @RequestMapping("dojo/{dojositeid}") 
	 public String NinjaPage(@PathVariable(value = "dojositeid") Long dojoId, Model model) {
		 
		 Dojo dojosite = this.dojoSer.getDojoById(dojoId);
		 List<Ninja> allNinjas = dojosite.getNinjas();
		 model.addAttribute("dojoSite", dojosite.getName());
		 model.addAttribute("viewAllNinjas",allNinjas);
		 return"allninjaspage.jsp";
	  
	}
	 
	
	
	
	
	
	
}
