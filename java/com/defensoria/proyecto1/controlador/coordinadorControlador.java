package com.defensoria.proyecto1.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class coordinadorControlador {

		@RequestMapping("/coordinador")
	public String coordinador(Model model) {

	      model.addAttribute("name", "World");
          //System.out.println("fdd");
		return "cordinador/index";
	}
	
	
	@RequestMapping("/usuarios")
	public String usuarios(Model model) {

    	model.addAttribute("name", "World");

		return "cordinador/usuarios/usuario";
	}
/*	@RequestMapping("/defensores")
	public String defensores(Model model) {

	       model.addAttribute("name", "World");

		return "cordinador/defensores";
	}*/

	@RequestMapping("/asignardefensor")
	public String asiganardefensor(Model model) {

	       model.addAttribute("name", "World");

		return "cordinador/usuarios/asignarDefensor";
	}
	@RequestMapping("/registrar")
	public String registrar(Model model) {

	model.addAttribute("name", "World");

		return "cordinador/usuarios/registrar";
	}
	
	@RequestMapping("/buscarUsuario")
	public String buscar(Model model) {

	model.addAttribute("name", "World");

		return "cordinador/usuarios/registrar";
	}
		
	
}
