/*2*/
package com.org.athtec.core.SpringUdemy2;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller /* */
@Slf4j /* Simple Logging Facade for Java (abreviado SLF4J) actúa como una fachada para
                diferentes marcos de registro (por ejemplo, java.util.logging, logback,
                Log4j). Ofrece una API genérica, lo que hace que el registro sea
                independiente de la implementación real. */
public class ControladorInicio
{

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model)/* Aquí se recibía el objero http servlet request y response, y utlizando
                                        uno de los alcances como "request", "session" o "application" se compartian
                                        atributos para desplegarlos en las paginas para desplegarlos en las paginas
                                        en los "jsp", en vez de todo eso se recibe un objeto llamado "model".
                                        Esta clase tiene la función de agregar información que se quiere compartir 
                                        con la vista (index.html)*/
    {
        var mensaje = "Fierro otra vez 2";

        log.info("Ejecutando controlador Spring MVC");
        /* return "html/index.html"; */
        model.addAttribute("mensaje", mensaje); /* ("llave", valorDeLaVariable) En este caso la variable es mensaje */
        model.addAttribute("saludo", saludo);
        return "index";


    }
}
