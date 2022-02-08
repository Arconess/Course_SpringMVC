package com.parcones.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parcones.model.Vacant;
import com.parcones.service.IVacanciesService;

@Controller
public class HomeController {
	
	@Autowired
	private IVacanciesService serviceVacancies;
	
	@GetMapping("/table")
	public String showTable(Model model) {
		
		List<Vacant> list = serviceVacancies.searchAll();
		model.addAttribute("vacancies", list);
		
		return "table";
		
	}
	
	@GetMapping("/detail")
	public String showDetails(Model model) {
		
		Vacant vacant = new Vacant();
		
		vacant.setName("Communications Engineer");
		vacant.setDescription("Engineer required for intranet support.");
		vacant.setDate(new Date());
		vacant.setSalary(2000.0);
		
		model.addAttribute("vacant", vacant);
		
		return "detail";
	}
	
	@GetMapping("/list")
	public String showList(Model model) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Systems Engineer");
		list.add("Accounting Assistant");
		list.add("Seller");
		list.add("Architect");
		
		model.addAttribute("jobs", list);
		
		
		return "list";
	}
	
	@GetMapping("/")
	public String showHome(Model model) {
		
//		model.addAttribute("message", "Welcome to Jobs app");
//		model.addAttribute("date", new Date());
		
		String name = "Assistant";
		Date datePub = new Date();
		double salary = 9000.0;
		boolean until = true;
		
		model.addAttribute("name", name);
		model.addAttribute("date", datePub);
		model.addAttribute("salary", salary);
		model.addAttribute("until", until);
		
		return "home";
	}

}
