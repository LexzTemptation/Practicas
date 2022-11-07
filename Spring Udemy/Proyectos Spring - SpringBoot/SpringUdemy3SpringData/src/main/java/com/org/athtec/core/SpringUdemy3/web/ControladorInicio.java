/*2*/
package com.org.athtec.core.SpringUdemy3.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.athtec.core.SpringUdemy3.dao.PersonaDao;

/* import java.util.ArrayList;
import java.util.Arrays; */
import org.springframework.beans.factory.annotation.Autowired;

/* import com.org.athtec.core.SpringUdemy.PersonaDao; */

/* import com.org.athtec.core.SpringUdemy3.domain.Persona; */

import lombok.extern.slf4j.Slf4j;


@Controller /* */
@Slf4j /* Simple Logging Facade for Java (abreviado SLF4J) actúa como una fachada para
                diferentes marcos de registro (por ejemplo, java.util.logging, logback,
                Log4j). Ofrece una API genérica, lo que hace que el registro sea
                independiente de la implementación real. */
public class ControladorInicio
{
    @Autowired/* Similar a la notación de "@Inject" */
    private PersonaDao PersonaDao;

    /*  Con lo siguiente se está compartiendo información del MODELO hacia la VISTA */
    @GetMapping("/")
    public String inicio(Model model)/* Aquí se recibía el objero http servlet request y response, y utlizando
                                        uno de los alcances como "request", "session" o "application" se compartian
                                        atributos para desplegarlos en las paginas para desplegarlos en las paginas
                                        en los "jsp", en vez de todo eso se recibe un objeto llamado "model".
                                        Esta clase tiene la función de agregar información que se quiere compartir 
                                        con la vista (index.html)*/
    {
        var personas = PersonaDao.findAll();

        log.info("Ejecutando controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";


    }
}
