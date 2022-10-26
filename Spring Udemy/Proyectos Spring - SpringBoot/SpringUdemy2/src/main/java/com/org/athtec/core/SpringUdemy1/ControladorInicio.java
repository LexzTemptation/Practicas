/*2*/
package com.org.athtec.core.SpringUdemy1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController /* RestController se utiliza para crear servicios web tranquilos
                   con la ayuda de la anotación @RestController. Esta anotación se usa a nivel
                   de clase y permite que la clase maneje las solicitudes realizadas por el
                   cliente. Entendamos la anotación @RestController usando un ejemplo. El
                   RestController permite manejar todas las API REST, como las solicitudes GET,
                   POST, Delete, PUT. */
@Slf4j /* Simple Logging Facade for Java (abreviado SLF4J) actúa como una fachada para
                diferentes marcos de registro (por ejemplo, java.util.logging, logback,
                Log4j). Ofrece una API genérica, lo que hace que el registro sea
                independiente de la implementación real. */
public class ControladorInicio
{
    @GetMapping("/")
    public String inicio()
    {
        log.info("Ejecutando controlador REST");
        log.debug("Más detalle del controlador"); /* Con este se manda información más detallada del controlador
                                                        este se trae de la case "application.properties" del
                                                        "src/main/resources". */
        return "Hey Spring 2 vro";


    }
}
