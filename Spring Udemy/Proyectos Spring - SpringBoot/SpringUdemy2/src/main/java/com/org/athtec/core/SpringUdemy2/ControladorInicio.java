/*2*/
package com.org.athtec.core.SpringUdemy2;

/* import java.util.ArrayList; */
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.athtec.core.SpringUdemy2.domain.Persona;

import lombok.extern.slf4j.Slf4j;


@Controller /* */
@Slf4j /* Simple Logging Facade for Java (abreviado SLF4J) actúa como una fachada para
                diferentes marcos de registro (por ejemplo, java.util.logging, logback,
                Log4j). Ofrece una API genérica, lo que hace que el registro sea
                independiente de la implementación real. */
public class ControladorInicio
{
    /*  Para poder acceder a la informacion de "application.properties" especificamente a 
        la llave valor, se utiliza la anotación "@Value", ATENCIÓN EN ESTO, ya que si se
        anota otra cosa referido a lombok, la applicación no va a funcionar.
    */
    @Value("${index.saludo}") /* Spring lo que hace es aplicar el mismo concepto de inyección de dependencias,
                                así que debido a que la información de application.properties ya está disponible
                                para el contenedor de Spring, lo que hace Spring es buscar de manera automatica 
                                la llave "${index.saludo}" utilizando la sintaxis y toma el valor relacionado a 
                                esta llave y lo inyecta como valor de la variable "saludo".
                               */
    private String saludo;

    /*  Con lo siguiente se está compartiendo información del MODELO hacia la VISTA */
    @GetMapping("/")
    public String inicio(Model model)/* Aquí se recibía el objero http servlet request y response, y utlizando
                                        uno de los alcances como "request", "session" o "application" se compartian
                                        atributos para desplegarlos en las paginas para desplegarlos en las paginas
                                        en los "jsp", en vez de todo eso se recibe un objeto llamado "model".
                                        Esta clase tiene la función de agregar información que se quiere compartir 
                                        con la vista (index.html)*/
    {
        var mensaje = "Fierro otra vez 2";

        /* Se crea una variable del tipo persona e inicializamos cada uno de sus valores 
         * y se comparte la información utilizando la clase de model, compartiendo el objeto de persona.
        */
        var persona = new Persona();
        persona.setNombre("Lexz");
        persona.setApellido("Temptation");
        persona.setEmail("lexz_temptation@outlook.com");
        persona.setTelefono("4776712536");

        var persona2 = new Persona();
        persona2.setNombre("Lexz");
        persona2.setApellido("Temptation");
        persona2.setEmail("lexz_temptation@outlook.com");
        persona2.setTelefono("4776712536");

        /* Existen varias formas de hacer un array, pero la segunda (Arrays.asList) es más simplificada */

        /* var personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2); */

        var personas = Arrays.asList(persona, persona2); /* Lista llena para mmostrar elementos en el html */
        /* var personas = new ArrayList<>(); */ /* Lista vacia para mmostrar elementos en el html */

        log.info("Ejecutando controlador Spring MVC");
        /* return "html/index.html"; */
        model.addAttribute("mensaje", mensaje); /* ("llave", valorDeLaVariable) En este caso la variable es mensaje */
        model.addAttribute("saludo", saludo); 
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";


    }
}
