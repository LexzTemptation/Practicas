package com.org.athtec.SpringUdemy4.service;

import java.util.List;

import com.org.athtec.SpringUdemy4.domain.Persona;

public interface PersonaService
{
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

    
}
