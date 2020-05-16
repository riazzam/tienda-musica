package com.lrm.sprng.tiendamusica.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lrm.sprng.tiendamusica.models.entities.Estilo;


public interface IEstiloDAO  extends CrudRepository<Estilo, Long>{
	@Query ("select estilo from Estilo estilo where estilo.nombreEstilo like %?1%")	
	public List<Estilo> findAllByNombreEstilo(String term);

}
