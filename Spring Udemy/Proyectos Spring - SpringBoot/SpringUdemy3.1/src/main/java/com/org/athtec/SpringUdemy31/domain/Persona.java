package com.org.athtec.SpringUdemy31.domain;

import java.io.Serializable;

import javax.persistence.*;

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
@Entity
@Table(name = "persona")
public class Persona implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona;
    private String nombre, apellido, email, telefono;
}
