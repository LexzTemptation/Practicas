/* Data Anotation Object */
package com.org.athtec.core.SpringUdemy3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.athtec.core.SpringUdemy3.domain.Persona;

@Repository
public interface PersonaDao extends CrudRepository<Persona, Long>
{

}
