/*  */
package com.athtec.core.SpringUdemy3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.org.athtec.core.SpringUdemy3.domain.Persona;

@Service
@Component
@Repository
public interface PersonaDao extends CrudRepository<Persona, Long>
{

}
