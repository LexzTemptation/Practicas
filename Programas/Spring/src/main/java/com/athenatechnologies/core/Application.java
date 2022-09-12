package com.athenatechnologies.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.athenatechnologies.core.components.PostComponent;
import com.athenatechnologies.core.model.ConnectionDb;
import com.athenatechnologies.core.service.PostService_interfaz;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	@Qualifier("beanConnection")
	private ConnectionDb connectionDb;

	@Autowired
	@Qualifier("com.athenatechnologies.core.components.PostComponent")
	public PostComponent postComponent;

	@Autowired
	public PostService_interfaz postService_interfaz;

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		/*postComponent.getPosts().forEach(p -> 
		{
			System.out.println(p.getDescription());
		});*/

		postService_interfaz.validationId(postComponent.getPosts())
		.forEach((post) -> 
		{
			System.out.println(post.getTitle());
		});
	}
}
