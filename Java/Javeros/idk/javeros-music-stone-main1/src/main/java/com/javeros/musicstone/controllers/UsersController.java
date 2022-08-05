package com.javeros.musicstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController 
{
	@GetMapping
	public String showEmployeesList(Model model)
	{
		model.addAttribute("title","Usuarios");
		return "employees/employees-list";
	}
	
	@GetMapping("/form")
	public String showEmployeesForm(Model model)
	{
		model.addAttribute("title","Registro de empleados");
		return "employees/employees-form";
	}
	
}
