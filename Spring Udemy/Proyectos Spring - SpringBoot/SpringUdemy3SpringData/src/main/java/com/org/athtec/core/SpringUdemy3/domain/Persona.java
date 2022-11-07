package com.org.athtec.core.SpringUdemy3.domain;

import java.io.Serializable; /* Se conoce como una "interfaz de marcador".  
                                La interfaz Serializable está presente en el paquete java.io. 
                                Una interfaz de marcador no tiene métodos ni campos. 
                                Por lo tanto, las clases que lo implementan no tienen
                                que implementar ningún método. Las clases lo implementan 
                                si quieren que sus instancias se serialicen o deserialicen. 
                                La serialización es un mecanismo para convertir el estado de
                                un objeto en un flujo de bytes. */
import javax.persistence.*; /* Debido a que se utilizarán varias clases del 
                            paquete, se importará todo el paquete */
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
@Entity /* Especifica que la clase es una entidad. Esta anotación se aplica a la clase de entidad.*/
@Table(name = "persona") /* Está notación no es necesaria, pero puede causar errores en otros SO.
                            De cualquier forma, si la clase de java no se escribe igual que en la
                            BD puede provocar que los qery tengan errores.
                            Sintaxis: @Table(name = "nombre de de la tabla")*/

public class Persona implements Serializable /*  */
{
    private static final long serialVersionUID = 1L; // 1L= Uno de tipo Long.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona; // Llave primaria de la tabla en la bd correspondiente a la clase.
    private String nombre, apellido, email, telefono;
}
