package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.uca.capas.domain.usuario;

@Controller
public class MainController {
	
	@GetMapping("/agregarUsuario")
	public String enviarForm(usuario user) {
		return "agregar";
	}

	
	@PostMapping("/agregarUsuario")
	public String procesarForm(usuario user){
		System.out.println(user.getNombre());
		System.out.println(user.getOcupacion());
		return "mostrarMensaje";
	}
	
	
}
