package com.parcones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vacancies")
public class VacantsController {

	@GetMapping("delete")
	public String delete(@RequestParam("id") int idVacant, Model model) {
		
		System.out.println("ID: " + idVacant);
		
		model.addAttribute("id", idVacant);
		
		return "/vacancies/message";
	}
	
	@GetMapping("/view/{id}")
	public String showDetails(@PathVariable("id") int idVacant, Model model) {
		
		System.out.println("ID: " + idVacant);
		
		model.addAttribute("idVacant", idVacant);
		
		return "/vacancies/details";
	}
}
