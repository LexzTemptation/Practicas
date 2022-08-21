package com.javeros.musicroom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping
	public String showIndex() {
		return "index";
	}
	
	@GetMapping("/main")
	public String showMain() {
		return "main";
	}
	
	@GetMapping("/signin")
	public String showSignIn(Model model) {
		model.addAttribute("title", "Iniciar Sesión");
		return "auth/signin";
	}

}
