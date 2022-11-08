/* En este proyecto se trabajo con tecnología Thymeleaf */

package com.org.athtec.core.SpringUdemy3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.org.athtec.SpringUdemy4"})
@SpringBootApplication
public class SpringUdemy3Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringUdemy3Application.class, args);
		/*
		 * El metodo "run" ejecuta el servidor "apache tomcat" que el programa tiene
		 * embebido
		 */
	}

}
