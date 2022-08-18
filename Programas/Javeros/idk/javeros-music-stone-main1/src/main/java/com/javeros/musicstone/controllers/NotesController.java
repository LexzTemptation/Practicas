package com.javeros.musicstone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notes")
public class NotesController {
	
	@GetMapping
	public String showNoteList(Model model) {
		model.addAttribute("title", "Notas");
		return "notes/notes-list";
	}
	
	@GetMapping("/form")
	public String showFormNotes(Model model) {
		model.addAttribute("title", "Nota");
		return "notes/notes-form";
	}
}
