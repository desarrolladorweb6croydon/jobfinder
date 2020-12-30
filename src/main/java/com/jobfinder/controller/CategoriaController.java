/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobfinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jobfinder.model.Categoria;
import com.jobfinder.service.ICategoriaService;

/**
 *
 * @author DesarrolladorWeb6
 */

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	ICategoriaService categoriaService;

	@GetMapping({ "", "/" })
	public String categorias(Model model) {
		model.addAttribute("categorias", categoriaService.listarTodo());
		return "views/categorias/listCategorias";
	}

	@GetMapping("/formulario")
	public String crear(Categoria categoria) {
		return "views/categorias/formCategoria";
	}

	@PostMapping("/guardar")
	public String guardar(Categoria categoria, BindingResult result, RedirectAttributes attributes) {

		if (result.hasErrors()) {
			for (ObjectError error : result.getAllErrors()) {
				System.out.println(error.getDefaultMessage());
			}
			return "views/categorias/formCategoria";
		}
		System.out.println(categoria);
		categoriaService.guardar(categoria);
		attributes.addFlashAttribute("creado", "Categoria creada satisfactoriamente.");
		return "redirect:/categorias";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") int id,RedirectAttributes attributes) {
		categoriaService.eliminar(id);
		attributes.addFlashAttribute("eliminado", "Categoria eliminada satisfactoriamente.");
		return "redirect:/categorias";
	}

}
