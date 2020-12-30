package com.jobfinder.controller;

import com.jobfinder.model.Vacante;
import com.jobfinder.service.IVacanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	IVacanteService vacanteService;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("vacantes", vacanteService.listarTodo());
		return "home";
	}

	@GetMapping("/{id}")
	public String detalle(@PathVariable("id") int id, Model model) {
		Vacante vacante = vacanteService.buscarPorId(id);
		model.addAttribute("vacante", vacante);
		return "views/vacantes/detalle";
	}

}
