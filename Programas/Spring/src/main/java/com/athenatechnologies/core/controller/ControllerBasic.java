package com.athenatechnologies.core.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.athenatechnologies.core.entity.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic
{

	public List<Post> getPosts()
	{
		ArrayList<Post> post = new ArrayList<>();

		post.add(new Post(1, "Lorem ipsum dolor sit, amet consectetur adipisicing elit.",
				"http://localhost:8080/img/aqua.jpg",
				"Desarrollo web", new Date()));
		post.add(new Post(2, "Lorem ipsum dolor sit, amet consectetur adipisicing elit.",
				"http://localhost:8080/img/aqua.jpg",
				"Desarrollo web", new Date()));
		post.add(new Post(3, "Lorem ipsum dolor sit, amet consectetur adipisicing elit.",
				"http://localhost:8080/img/aqua.jpg",
				"Desarrollo web", new Date()));
		post.add(new Post(4, "Lorem ipsum dolor sit, amet consectetur adipisicing elit.",
				"http://localhost:8080/img/aqua.jpg",
				"Desarrollo web Vro", new Date()));
		return post;
	}

	@GetMapping(path = {"/post","/"})
	public String saludo(Model model)
	{
		model.addAttribute("posts", this.getPosts());

		return "index";
	}
}
