/* Data Access Object*/
package com.org.athtec.SpringUdemy31.dao;

import org.springframework.data.repository.CrudRepository;

import com.org.athtec.SpringUdemy31.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>
{

}
