/*2*/
package com.org.athtec.core.SpringUdemy2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller /* */
@Slf4j /* Simple Logging Facade for Java (abreviado SLF4J) actúa como una fachada para
                diferentes marcos de registro (por ejemplo, java.util.logging, logback,
                Log4j). Ofrece una API genérica, lo que hace que el registro sea
                independiente de la implementación real. */
public class ControladorInicio
{
    @GetMapping("/")
    public String inicio()
    {
        log.info("Ejecutando controlador Spring MVC");
        /*return "html/index.html";*/
        return "index";


    }
}
