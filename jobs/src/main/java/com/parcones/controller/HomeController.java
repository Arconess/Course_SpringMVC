package com.parcones.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parcones.model.Vacant;

@Controller
public class HomeController {
	
	@GetMapping("/table")
	public String showTable(Model model) {
		
		List<Vacant> list = getVacants();
		model.addAttribute("vacants", list);
		
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
	
	
	private List<Vacant> getVacants(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Vacant> list = new LinkedList<Vacant>();
		
		try {
			Vacant vacant1 = new Vacant();
			vacant1.setId(1);
			vacant1.setName("Communications Engineer");
			vacant1.setDescription("Engineer required for intranet support.");
			vacant1.setDate(sdf.parse("08-02-2019"));
			vacant1.setSalary(2000.0);
			
			Vacant vacant2 = new Vacant();
			vacant2.setId(2);
			vacant2.setName("Electrical Engineer");
			vacant2.setDescription("Electrical Engineer description");
			vacant2.setDate(sdf.parse("10-10-2020"));
			vacant2.setSalary(3000.0);
			
			Vacant vacant3 = new Vacant();
			vacant3.setId(3);
			vacant3.setName("Graphic Designer");
			vacant3.setDescription("Graphic Designer description");
			vacant3.setDate(sdf.parse("24-05-2021"));
			vacant3.setSalary(2100.0);
			
			Vacant vacant4 = new Vacant();
			vacant4.setId(4);
			vacant4.setName("Bookkeeper");
			vacant4.setDescription("Bookkeeper description");
			vacant4.setDate(sdf.parse("17-02-2022"));
			vacant4.setSalary(1500.0);
			
			list.add(vacant1);
			list.add(vacant2);
			list.add(vacant3);
			list.add(vacant4);
		} catch (ParseException e) {
			System.out.println("Error: " + e);
		}
		
		return list;
	}

}
