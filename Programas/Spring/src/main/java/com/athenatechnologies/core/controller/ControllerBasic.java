package com.athenatechnologies.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ControllerBasic
{
	@GetMapping(path = {"/post","/"})
	public String saludo()
	{
		return "index";
	}
}
