package com.lrm.sprng.tiendamusica.services;

import java.util.List;

import com.lrm.sprng.tiendamusica.models.entities.Estilo;
import com.lrm.sprng.tiendamusica.models.entities.Interpretacion;
import com.lrm.sprng.tiendamusica.models.entities.Interprete;
import com.lrm.sprng.tiendamusica.models.entities.Tema;

public interface IInterpretacionService {
	public List<Interpretacion> findAll();
	public void save(Interpretacion interpretacion);
	public Interpretacion findOne(Long id);
	public List<Tema> findByNombreTema(String term);
	public List<Estilo> findByNombreEstilo(String term);
	public List<Interprete> findByNombreInterprete(String term);
}
