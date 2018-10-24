package com.defensoria.proyecto1.controlador;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.WebAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.defensoria.component.Console;

@Controller
public class loginController {

	/*@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}*/
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
		@RequestParam(name="error",required=false) String error,
		@RequestParam(name="logout",required=false) String 	logout,HttpServletRequest request,HttpServletResponse response) throws IOException	{
			model.addAttribute("error",error);
			model.addAttribute("logout",logout);
			     
			    if (request.getRemoteUser() != null) {
			       // Console.println("fuera de sesion", "");
			        return "redirect:/loginsuccess";			
		        }
		       
			//response.sendRedirect("/admin");
			//System.out.println(request.getSession());
		return "/login";
		//	return "redirect:/logout";		
	}
	
	@GetMapping({"/loginsuccess","/"})
	public String showLoginForm(HttpServletRequest request,Authentication auth) {
	   Principal principal =request.getUserPrincipal();
	      
		 Console.println("datos del usuarios", ""+request.getUserPrincipal());
		 Console.println("el usuarios", ""+request.isUserInRole("defensor"));
		Console.println("hay algo?", ""+auth.getAuthorities());
		Console.println("hay algo?", ""+request.BASIC_AUTH);
		Console.println("hay algo?", ""+request.DIGEST_AUTH);
		Console.println("hay algo?", ""+request.FORM_AUTH);
		// Console.println("hay algo?", ""+@RolesAllowed("hasRole('defensor')"));
		 
		return "Administrador/index"; //"redirect:Administrador/index";
	}
}
