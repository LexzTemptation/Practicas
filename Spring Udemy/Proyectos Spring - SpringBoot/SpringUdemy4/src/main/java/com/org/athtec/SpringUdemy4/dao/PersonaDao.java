/* Data Access Object*/
package com.org.athtec.SpringUdemy4.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.athtec.SpringUdemy4.domain.Persona;

@Repository
public interface PersonaDao extends CrudRepository<Persona, Long>
{

}
