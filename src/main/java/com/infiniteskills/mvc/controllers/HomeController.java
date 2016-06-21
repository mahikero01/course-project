package com.infiniteskills.mvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infiniteskills.mvc.data.entities.Project;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome(Model model){
		
		Project project = new Project();
		project.setName("First project");
		project.setSponsor("nasa");
		project.setDescription("thsi is a simple");
		
		model.addAttribute("currentProject", project);
		return "home";
	}
}
