package com.lrm.sprng.tiendamusica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrm.sprng.tiendamusica.models.dao.ITemaDAO;
import com.lrm.sprng.tiendamusica.models.entities.Tema;
@Service
public class TiendaServiceImpl  implements ITiendaService{

	@Autowired
	private ITemaDAO temaDAO;
	
	@Override
	public List<Tema> findAll() {
		
		return (List<Tema>) temaDAO.findAll();
	}

	@Override
	public void save(Tema tema) {
		temaDAO.save(tema);
		
	}

	@Override
	public Tema findOne(Long id) {
		
		return temaDAO.findById(id).orElse(null);
	}

	@Override
	public List<Tema> findByName(String term) {
		
		return temaDAO.findByNombreTemaLikeIgnoreCase(term);
	}

}
