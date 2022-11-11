package com.org.athtec.SpringUdemy41.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.athtec.SpringUdemy41.domain.Persona;

@Service
public interface PersonaService
{
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

    
}
