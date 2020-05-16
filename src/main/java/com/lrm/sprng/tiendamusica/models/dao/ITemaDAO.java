package com.lrm.sprng.tiendamusica.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lrm.sprng.tiendamusica.models.entities.Tema;

public interface ITemaDAO extends CrudRepository<Tema, Long>{
	//
	//public List<Tema> findAllByNombreTema(String term);
	@Query ("select t from Tema t where t.nombreTema like %?1%")	
	public List<Tema> findByNombreTemaLikeIgnoreCase(String term);
	

}
