package com.athenatechnologies.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.athenatechnologies.core.model.ConnectionDb;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	@Qualifier("beanConnection")
	private ConnectionDb connectionDb;
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		System.out.println();
		System.out.println("Nombre de la base de datos: " + connectionDb.getNombreBd());
		System.out.println();
	}
}
