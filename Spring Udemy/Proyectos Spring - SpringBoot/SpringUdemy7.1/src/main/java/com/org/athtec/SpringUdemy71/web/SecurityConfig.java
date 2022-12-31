package com.org.athtec.SpringUdemy71.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{

	/* Este método recibe un objeto de "AutenticationManagerBuilder",
	   el cual sirve para agregar más usuarios y personalizarlos para
	   hacer loggin en la aplicación */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
				.withUser("admin")
					.password("{noop}1234") /* De esta manera no se encripta el password */
					.roles("ADMIN", "USER")
				.and()
				.withUser("user")
					.password("{noop}1234")
					.roles("USER");
	}
	/* Este método recibe un parameto de "http security", el cual se va
	   a utilizar para restringir las url's de la aplicación web a otros
	   usuarios que no estén autorizados a entrar a ellas y según el
	   rol que se le haya asignado */
}
