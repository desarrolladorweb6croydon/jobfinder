package com.jobfinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.jobfinder.model.Vacante;
import com.jobfinder.service.ICategoriaService;
import com.jobfinder.service.IVacanteService;

@Controller
@RequestMapping("/vacantes")
public class VacanteController {

	@Autowired
	private IVacanteService vacanteService;

	@Autowired
	private ICategoriaService categoriaService;

	@GetMapping({ "/", "" })
	public String vacantes(Model model) {
		model.addAttribute("vacantes", vacanteService.listarTodo());
		
		return "views/vacantes/listVacantes";
	}

	@GetMapping("/formulario")
	public String crear(Vacante vacante, Model model) {
		model.addAttribute("categorias", categoriaService.listarTodo());
		return "views/vacantes/formVacante";
	}

	@PostMapping("/guardar")
	public String guardar(Vacante vacante, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			for (ObjectError error : result.getAllErrors()) {
				System.out.println("Ocurrio un error: " + error.getDefaultMessage());
				System.out.println(vacante);
			}
			return "views/vacantes/formVacante";
		}
		vacanteService.guardar(vacante);
		System.out.println(vacante);
		attributes.addFlashAttribute("msg","ok");
		return "redirect:/vacantes";
	}

}
