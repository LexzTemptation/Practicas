package com.org.athtec.SpringUdemy71.web;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer
{
    /* Este método da por default el lenguaje en español */
    @Bean
    public LocaleResolver localeResolver()
    {
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("es"));
        return slr;
    }

    /* Esto permite cambiar la configuración regional actual en cada solicitud, a través de un parámetro de solicitud configurable */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor()
    {
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    
    /* Este método es el que recibe si se cambia el lenguaje o no */
    @Override
    public void addInterceptors(InterceptorRegistry registro)
    {
        registro.addInterceptor(localeChangeInterceptor());
    }

    /* Este método sirve para cambiar la vista por default al iniciar la applicación */
    @Override
    public void addViewControllers(ViewControllerRegistry registro)
    {
        registro.addViewController("/login");
        registro.addViewController("/").setViewName("index"); /* manda al index después del logueo */
        registro.addViewController("/error/403").setViewName("/error/403");;/* Registro de la página de error */
    }
}
