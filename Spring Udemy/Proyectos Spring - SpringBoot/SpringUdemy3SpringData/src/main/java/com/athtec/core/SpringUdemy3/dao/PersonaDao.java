package com.athtec.core.SpringUdemy3.dao;

import org.springframework.data.repository.CrudRepository;

import com.org.athtec.core.SpringUdemy3.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>
{

}
