package com.jobfinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobfinder.service.IVacanteService;

@Controller
@RequestMapping("/vacantes")
public class VacanteController {
	
	@Autowired
	IVacanteService vacanteService;
	
	@GetMapping({"/"})
	public String vacantes(Model model){
		
		model.addAttribute("vacantes",vacanteService.listarTodo());
		return "views/vacantes/listVacantes";
	}

}
