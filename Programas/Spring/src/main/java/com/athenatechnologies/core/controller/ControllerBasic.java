package com.athenatechnologies.core.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.athenatechnologies.core.configuration.Pages;
import com.athenatechnologies.core.model.Post;

@Controller
@RequestMapping("/home") /*
							 * @RequestMapping:
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

	@GetMapping(path = {"/posts", "/"}) /* @GetMapping:
										* 
										* Es una anotación de que nos permite simplificar el manejo
										* de los diferentes métodos de Spring MVC, estos solicitan
										* los @RequestMappings que se hicieron anterior mente.
										*/
	public String saludo(Model vro) /*
									 * Model:
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

	/* Model and view */
	/*
	 * ModelAndView es un titular para ambos y en el marco web MVC. Estas dos clases
	 * son distintas; simplemente contiene ambos para hacer posible que un
	 * controlador devuelva tanto el modelo como la vista en un solo valor devuelto.
	 * ModelViewModelAndView
	 * La vista se resuelve mediante un objeto; el modelo son datos almacenados en
	 * un archivo . ViewResolverMap
	 */

	/*
	 * @GetMapping(path = "/public")
	 * public ModelAndView post()
	 * {
	 * ModelAndView mav = ModelAndView("Pages.HOME");
	 * mav.addObject("posts", this.getPosts());
	 * return mav;
	 * }
	 * private ModelAndView ModelAndView(String string)
	 * {
	 * return null;
	 * }
	 */

	/*
	@GetMapping(path = {"/post"})														//Ya se le está dando un parametro, por eso es falso
	public ModelAndView getPostIndividual(@RequestParam(defaultValue = "1", name = "id", required = false) int id) */
	/* @RequestParam:
	 * 
	 * Anotación que indica que un parámetro de método debe vincularse a un parámetro de solicitud web.
	 * 
	 * Compatible con métodos de controlador anotados en Spring MVC y Spring WebFlux de la siguiente manera:
	 * 
	 * En Spring MVC, los "parámetros de solicitud" se asignan a parámetros de consulta, datos de formulario
	 * y partes en solicitudes de varias partes. Esto se debe a que la API de servlet combina parámetros
	 * de consulta y datos de formulario en un solo mapa llamado "parámetros", y eso incluye el análisis
	 * automático del cuerpo de la solicitud.
	 */
	/*
	{
		ModelAndView mav = new ModelAndView(Pages.POST);         //postFiltrado
		List<Post> postFiltrado = this.getPosts().stream().filter((p) -> {return p.getId() == id;}).collect(Collectors.toList());

		mav.addObject("post", postFiltrado.get(0));

		return mav;
	}
	*/

	//Esta es otra forma de hacer lo de arriba solo que la ruta en el navegador sería algo así: localhost:8080/home/post/p/"num"
	@GetMapping(path = { "/post","/post/p/{post}" })
	public ModelAndView getPostIndividual
	(@PathVariable(required = true, name = "post") int id)
	{
		ModelAndView mav = new ModelAndView(Pages.POST);
		List<Post> postFiltrado = this.getPosts().stream().filter((p) ->
		{
			return p.getId() == id;
		}).collect(Collectors.toList());

		mav.addObject("post", postFiltrado.get(0));

		return mav;
	}

	//Vidio 13
	@GetMapping("/newPost") //se le agrego nueva ruta
	public ModelAndView getForm()
	{
		return new ModelAndView("form").addObject("post", new Post()); //Se manda el formulario a form y se manda un nuevo objeto
	}

	//Esta parte se puede sustituir por un gestor de base de datos
	//Para crear un nuevo recurso esta el @PostMapping
	@PostMapping("/addNewPost")
	public String addNewPost(Post post, Model vro)
	{
		List<Post> posts = this.getPosts();
		posts.add(post);
		vro.addAttribute("posts", posts);

		return "index";
	}

}
