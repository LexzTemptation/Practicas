package com.org.athtec.SpringUdemy41.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.athtec.SpringUdemy41.dao.PersonaDao;
import com.org.athtec.SpringUdemy41.domain.Persona;

@Service
public class PersonaServiceImpl implements PersonaService
{

    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional
    public List<Persona> listarPersonas()
    {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    public void guardar(Persona persona)
    {
        personaDao.save(persona);
        
    }

    @Override
    public void eliminar(Persona persona)
    {
        personaDao.delete(persona);
        
    }

    @Override
    public Persona encontrarPersona(Persona persona)
    {
        return personaDao.findById(persona.getId_persona()).orElse(null);
    }
    
}
