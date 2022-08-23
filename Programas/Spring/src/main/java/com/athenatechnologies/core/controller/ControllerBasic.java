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
@RequestMapping("/home")/* @RequestMapping:
						*
						* Se utiliza para asignar solicitudes HTTP a métodos de controlador de
						* controladores MVC y REST.
						* En las aplicaciones MVC de Spring, el DispatcherServlet (Front Controller) es
						* responsable de enrutar las solicitudes HTTP entrantes a los métodos de
						* controlador de los controladores. Al configurar Spring MVC, debe especificar
						* las asignaciones entre las solicitudes y los métodos de controlador
						*/
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

		/* */
		
		return post;
	}

	@GetMapping(path = {"/post","/"}) /* @GetMapping:
										*
										* Es una anotación de que nos permite simplificar el manejo
										* de los diferentes métodos de Spring MVC, estos solicitan
										* los @RequestMappings que se hicieron anterior mente.
										*/
	public String saludo(Model vro) /* Model:
									 *
									 * Model es una interfaz que define un soporte para los atributos del modelo
									 * y está diseñado principalmente para agregar atributos al modelo.
									 * es una extensión de con la capacidad de almacenar atributos en un mapa y
									 * llamadas a métodos de cadena. es un soporte para un modelo y una vista;
									 * permite devolver tanto el modelo como la vista en un valor devuelto.
									 */
	{
		vro.addAttribute("posts", this.getPosts());

		return "index";
	}
}
