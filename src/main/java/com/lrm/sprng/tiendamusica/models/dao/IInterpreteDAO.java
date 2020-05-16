package com.lrm.sprng.tiendamusica.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lrm.sprng.tiendamusica.models.entities.Estilo;
import com.lrm.sprng.tiendamusica.models.entities.Interprete;

public interface IInterpreteDAO extends CrudRepository<Interprete, Long> {
	@Query ("select int from Interprete int where int.nombreInterprete like %?1%")	
	public List<Interprete> findAllByNombreInterpretacion(String term);

}
