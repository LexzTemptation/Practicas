/*  */
package com.athtec.core.SpringUdemy3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.athtec.core.SpringUdemy3.domain.Persona;

@Transactional
@Service
@Component
@Repository
public interface PersonaDao extends CrudRepository<Persona, Long>
{

}
