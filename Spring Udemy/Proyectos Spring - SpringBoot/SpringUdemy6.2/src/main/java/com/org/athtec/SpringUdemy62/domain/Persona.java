package com.org.athtec.SpringUdemy62.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data /*La notación "@Data" no es necesaria, pero es parte del proyecto lombok,
       * no tiene nada que ver con el famework de Spring, pero debido a que se utilizó,
       * se creó de manera automatica el estandar de los "JavaBeans", es decir, el
       * constructor vacío, métodos getters y setters, y los métodos toString, equals
       * y hashCode.
       * 
       * JavaBeans son clases que encapsulan muchos objetos en un solo objeto (el
       * bean). 
       * Es una clase java que debe seguir las siguientes convenciones:
       * 
       * -Debe implementar Serializable.
       * -Debe tener un constructor público sin argumentos.
       * -Todas las propiedades en java bean deben ser privadas con métodos getters y
       * setter públicos. */
@Entity/* Con esto estamos haciendo que la clase de persona se haga una de entidad
          para la base de datos */
@Table(name = "persona")/* Aquí no es necesaria agregar esta notación pero en otros
                            sistemas operativos (como linux y mac) se tiene que
                            hacer para que no den error al momento de manejar el mapeo
                            de la tabla, esto sucede por la diferencia de mayusculas y minusculas
                            en la base de datos, la tabla "persona" tiene la primer letra
                            escrita con minusculas y en la clase de java está con mayuscula.*/
public class Persona implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona;

    /* Para que el campo de nombre y apellido no esté vacio se maneja la 
       notación "@NotEmpty", esto hace que este campo sea obligatorio llenarlo.
       Cuando se trabaja con cadenas se usa está notación, en caso de numeros se usa "@NotNull"
    */
    @NotEmpty
    private String nombre, apellido;
    @NotEmpty
    @Email /* Este campo a demás de no estar vacio tiene el formato de "@Email" valido.
              Si es que en el formulario tiene un campo de tipo texto, se puede validar
              desde aquí dandole el tipo al que pertenece 
            */
    private String email;
    private String telefono;
}
