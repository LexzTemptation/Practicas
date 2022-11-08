package com.org.athtec.core.SpringUdemy.servicio;

import java.util.List;

import com.org.athtec.core.SpringUdemy3.domain.Persona;

public interface PersonaService
{
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrar(Persona persona);

}
