/* En este proyecto se trabajo con tecnología Thymeleaf */

package com.org.athtec.SpringUdemy31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.org.athtec.SpringUdemy31"})
@SpringBootApplication
public class SpringUdemy31Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringUdemy31Application.class, args);
		/*El metodo "run" ejecuta el servidor "apache tomcat" que el programa tiene embebido */
	}

}
