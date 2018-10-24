package com.defensoria.proyecto1.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/defe")
public class controlador {

	@RequestMapping("/login")
	public String login(Model model) {

	model.addAttribute("name", "World");

		return "login";
	}
	
	/*@RequestMapping("/defensor")
	public String defensores(Model model) {

	model.addAttribute("name", "World");

		return "Defensor/index";
	}*/
	
	
	@RequestMapping("/admin")
	public String admin(Model model) {

	model.addAttribute("name", "World");

		return "Administrador/index";
	}
	

	
	
/*	@RequestMapping("/")
	public String index(Model model) {

	model.addAttribute("name", "World");
     System.out.println("dd");
		return "/index_";
	}
*/

}