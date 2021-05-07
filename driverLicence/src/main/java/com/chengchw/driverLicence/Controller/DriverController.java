package com.chengchw.driverLicence.Controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chengchw.driverLicence.Model.Driver;
import com.chengchw.driverLicence.Model.License;
import com.chengchw.driverLicence.Services.DriverService;
import com.chengchw.driverLicence.Services.LicenseService;

@Controller
public class DriverController {

	private final DriverService driverSer;
	private final LicenseService licenseSer;
	
	public DriverController(DriverService driverSer, LicenseService licenseSer) {
		
		this.driverSer = driverSer;
		this.licenseSer = licenseSer;
	}
	
	
	@RequestMapping("/person/new")
	public String index(@ModelAttribute("driver") Driver driver, Model model) {
		
		
		//System.out.println(driver.getFirstName());
		List<Driver> alldrive = this.driverSer.getAllDriver();
		//System.out.println(alldrive);
		//Integer array[] = { 1, 2, 3, 4, 5 };
		//List<Integer>[] arr = new ArrayList[10];
		model.addAttribute("alldriver",alldrive);
		return "Index.jsp";
	}
	
	@RequestMapping("/person/{index}")
	
	public String showDriverInfo(Model model, @PathVariable(value = "index") int index) {
		
		List<Driver> allDriver = this.driverSer.getAllDriver();
		
		Driver showDriver = allDriver.get(index);
		
		model.addAttribute("showDriver",showDriver);
		
		return "driverPage.jsp";
		
	}
	
	
	
	
	
	
	@PostMapping("/person/new")
	public String createDriver(@Valid @ModelAttribute("driver") Driver driver, Model model, 
								BindingResult result, RedirectAttributes redirectAttributes) {
		
		List<Driver> alldrive = this.driverSer.getAllDriver();
		model.addAttribute("alldriver",alldrive);

		if(driver.getFirstName().isEmpty() || driver.getLastName() == null || result.hasErrors()) {
			System.out.println("error");
			model.addAttribute("errors", "Pleas input valid driver");
			
			//redirectAttributes.addFlashAttribute("errors", "Pleas input valid driver");
    		return "Index.jsp";
    	}
		
		//System.out.println("Here");
		//Driver newDriver = this.driverSer.createNewDriver(driver);
		
		//Long newId = driver.getId();
		//model.addAttribute("id", newId);
		System.out.println(driver.getFirstName());
		
		return "Index.jsp";
	}
	
	@RequestMapping("/licenses/new")
	public String createDriver(Model model,@ModelAttribute("license") License license) {
		
		List<Driver> viewdrivers = this.driverSer.getDriverWithoutLic();
		model.addAttribute("alldriver", viewdrivers);
		
		return "createlicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String createLicense(@Valid Model model, @ModelAttribute("license") License license, BindingResult result) {
		
		List<Driver> viewdrivers = this.driverSer.getDriverWithoutLic();
		model.addAttribute("alldriver", viewdrivers);
		
		Date date = new Date();
		if(license.getState().isEmpty() || license.getExpireDate().before(date) || result.hasErrors()) {
			
			model.addAttribute("errors", "Pleas input valid date or state");
			
			return "createlicense.jsp";
		}
		
		//System.out.println(license.getLicenseStr());
		this.licenseSer.createLicense(license);
		license.getDriver().setLicense(license);
		//System.out.println(license.getLicenseStr());
		//System.out.println(license.getDriver().getFirstName());
		
		
		return "createlicense.jsp";
		
	}
	
	@RequestMapping("/person")
	public String showPerson(@RequestParam(value = "driver_index") int index, Model model) {
		
		//System.out.println(index);
		
		List<Driver> allDriver = this.driverSer.getAllDriver();
		
		Driver showDriver = allDriver.get(index);
		
		model.addAttribute("showDriver",showDriver);
		
		return "driverPage.jsp";
		
	}
	
	

}
