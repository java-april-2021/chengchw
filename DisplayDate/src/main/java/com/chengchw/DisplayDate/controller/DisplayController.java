package com.chengchw.DisplayDate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

@Controller
public class DisplayController {

	// set location to local to present
	@RequestMapping("/")
	public String index() {

		return "index.jsp";
	}

	Date current = new Date();
	Locale locale = new Locale("en", "US");

	@RequestMapping("/{dt}")
	public String PostDate(@PathVariable("dt") String dt, Model model) {

		if (dt.equals("time")) {

			SimpleDateFormat sdf = new SimpleDateFormat("h:mm a", locale);
			System.out.println(sdf.format(current));
			model.addAttribute("DateTime", sdf.format(current));

		}

		else {

			SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy", locale);
			System.out.println(sdf.format(current));
			model.addAttribute("DateTime", sdf.format(current));
		}

		return "DateTime.jsp";
	}

	/*
	 * @RequestMapping("/date") public String PostDate(Model model){ //model to pass
	 * the data we want to map to the viewer Date current = new Date();
	 * System.out.println(current); SimpleDateFormat sdf = new
	 * SimpleDateFormat("EEE, d MMM yyyy",locale); //Modify time to wanted output
	 * form System.out.println(sdf.format(current)); model.addAttribute("DateTime",
	 * sdf.format(current)); //Modify time to wanted output form
	 * 
	 * 
	 * return "DateTime.jsp"; }
	 * 
	 * @RequestMapping("/time") public String PostTime(Model model){ Date current =
	 * new Date(); SimpleDateFormat sdf = new SimpleDateFormat("h:mm a",locale);
	 * System.out.println(sdf.format(current)); model.addAttribute("DateTime",
	 * sdf.format(current));
	 * 
	 * return "DateTime.jsp"; }
	 */
}
