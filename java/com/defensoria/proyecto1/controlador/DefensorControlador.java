package com.defensoria.proyecto1.controlador;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.assertj.core.internal.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defensoria.component.Console;
import com.defensoria.proyecto1.entity.Defensor;
import com.defensoria.proyecto1.entity.Juzgado;
import com.defensoria.proyecto1.entity.Personal;
import com.defensoria.proyecto1.repository.PersonalRepository;
import com.defensoria.proyecto1.repository.service.implementacion.DefensorService;
import com.defensoria.proyecto1.repository.service.implementacion.PersonalService;

//@Controller
//@RequestMapping("/defensor")

@RestController
public class DefensorControlador {
@Autowired
@Qualifier("personalServiceImplemen")
private PersonalService personalService;

   @Autowired
   @Qualifier("defensorServiceImplemen")
   private DefensorService defensorlService;

   @Autowired
   private PersonalRepository personalRepository;
   //private PersonalService personalService;
@GetMapping("/listarDefensor")
public String listarTodosDefensor(Model model) {
	model.addAttribute("defensores",personalService.listAllPersonal()	);
	return "cordinador/defensores";
	
}
@PostMapping("/agregarDefensor")
public String addDefensor(@ModelAttribute(name="defensor") Defensor defensor,Personal personal,HttpServletRequest request) {
//public String addDefensor(Model model,Defensor defensor) {
	    
	Console.println("agregarDefensor", "agresando con exito");
      personal.setNombre(request.getParameter("nombre"));
      personal.setApMaterno(request.getParameter("apellido").split(" ")[0]);  
      personal.setApPaterno(request.getParameter("apellido").split(" ")[1]);  
      personal.setCorreoElectronico(request.getParameter("email"));
      personal.setCurp(request.getParameter("curp"));
      personal.setNue(request.getParameter("nue"));
      personal.setNup(request.getParameter("nup"));
      personal.setSexo(request.getParameter("genero"));
      personal.setTelefono(request.getParameter("telefono"));
	  
    /*
      defensor.setLugarAdscripcion(request.getParameter("adscripcion"));
      defensor.setRegionAdscripcion("oaxaca");
      defensor.setNoCedulaProfesional(244);
      defensor.setIdUsuarioSistema(personal.getIdPersonal());*/
      personal.setDefensor(defensor);
      
      Juzgado juzgado=new Juzgado();
      System.out.println(defensor.toString());
	  System.out.println(request.getAttribute("defensor")+request.getParameter("email"));

		Console.println("genero",request.getParameter("apellido").split(" ")[0]);
		Console.println("adscripcion",request.getParameter("adscripcion"));
		Console.println("Personal ",personal.toString());
		
		//personalService.addPersonal(personal);
		//defensorlService.addDefensor(defensor);
	return 	"redirect:/listarDefensor";
}
}
