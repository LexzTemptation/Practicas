/*2*/
package com.org.athtec.SpringUdemy41.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.athtec.SpringUdemy41.domain.Persona;
/* import com.org.athtec.SpringUdemy4.dao.PersonaDao; */
import com.org.athtec.SpringUdemy41.service.PersonaService;

import lombok.extern.slf4j.Slf4j;


@Controller /* La anotación @Controller indica que la clase anotada es un controlador. Es
             * una especialización de @Component y se detecta automáticamente a través del
             * escaneo de classpath. Por lo general, se usa en combinación con métodos de
             * controlador anotados basados en la anotación @RequestMapping. @RestController
             * es una anotación de conveniencia para hermanos para crear controladores
             * Restful.
             */
@Slf4j /* Simple Logging Facade for Java (abreviado SLF4J) actúa como una fachada para
                diferentes marcos de registro (por ejemplo, java.util.logging, logback,
                Log4j). Ofrece una API genérica, lo que hace que el registro sea
                independiente de la implementación real. */
public class ControladorInicio
{
    @Autowired /* Para poder inyectar cualquier otra dependencia/objeto que sea administrado por el contenedor
                se utiliza la notación "@Autowired", muy similar a "Inject"*/
    private PersonaService personaService; /* Ahora se inyecta la capade servicio */

    /*  Con lo siguiente se está compartiendo información del MODELO hacia la VISTA */
    @GetMapping("/")
    public String inicio(Model model)/* Aquí se recibía el objero http servlet request y response, y utlizando
                                        uno de los alcances como "request", "session" o "application" se compartian
                                        atributos para desplegarlos en las paginas para desplegarlos en las paginas
                                        en los "jsp", en vez de todo eso se recibe un objeto llamado "model".
                                        Esta clase tiene la función de agregar información que se quiere compartir 
                                        con la vista (index.html)*/
    {
        var personas = personaService.listarPersonas(); /* Se cambia el método */

        log.info("Ejecutando controlador Spring MVC");
        /* return "html/index.html"; */
        model.addAttribute("personas", personas);
        return "index";

    }

    @GetMapping("/agregar")
    public String agregar(Persona persona)
    {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona)
    {
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id_persona}")
    public String editar(Persona persona, Model model)
    {
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    /* @GetMapping("/eliminar/{id_persona}")
    public String eliminar(Persona persona, Model model)
    {
        personaService.eliminar(persona);
        return "redirect:/";
    } */

    /* Forma query param */
    @GetMapping("/eliminar") 
    public String eliminar(Persona persona)
    {
        personaService.eliminar(persona);
        return "redirect:/";
    }

}
