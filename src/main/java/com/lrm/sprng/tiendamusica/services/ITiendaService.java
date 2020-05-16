package com.lrm.sprng.tiendamusica.services;

import java.util.List;


import com.lrm.sprng.tiendamusica.models.entities.Tema;

public interface ITiendaService {
	public List<Tema> findAll();
	public void save(Tema tema);
	public Tema findOne(Long id);
	public List<Tema> findByName(String term);
}
