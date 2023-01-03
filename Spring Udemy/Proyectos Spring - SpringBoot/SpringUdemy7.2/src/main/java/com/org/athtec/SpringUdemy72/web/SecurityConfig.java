package com.org.athtec.SpringUdemy72.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	/* AUTENTICACIÓN */
	/* Este método recibe un objeto de "AutenticationManagerBuilder",
	   el cual sirve para agregar más usuarios y personalizarlos para
	   hacer loggin en la aplicación */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
				.withUser("admin")
					.password("{noop}1234") /* {noop}: De esta manera no se encripta el password */
					.roles("ADMIN", "USER")
				.and()
				.withUser("user")
					.password("{noop}1234")
					.roles("USER");
	}

	/* AUTORIZACIÓN */
	/* Este método recibe un parameto de "http security", el cual se va
	   a utilizar para restringir las url's de la aplicación web a otros
	   usuarios que no estén autorizados a entrar a ellas y según el
	   rol que se le haya asignado */
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
			.antMatchers("/editar/**", "/agregar/**", "/eliminar") /* Este método restringe los path y el eliminar */
				.hasRole("ADMIN") /* Solo los usuarios dentro de este método pueden ingresar a las rutas anteriormente mencionadas */
			.antMatchers("/")  /* Ruta raíz */
				.hasAnyRole("USER", "ADMIN") /* Cualquier usuario dentro de este método puede ingresar a la ruta anterior */
			.and()
				.formLogin()
				.loginPage("/login")/* Se indica la página de logueo */
			.and()
				.exceptionHandling().accessDeniedPage("/error/403")
			;
	}
}
