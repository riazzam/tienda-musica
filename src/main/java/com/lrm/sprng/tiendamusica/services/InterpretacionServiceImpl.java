package com.lrm.sprng.tiendamusica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lrm.sprng.tiendamusica.models.dao.IEstiloDAO;
import com.lrm.sprng.tiendamusica.models.dao.IInterpretacionDAO;
import com.lrm.sprng.tiendamusica.models.dao.IInterpreteDAO;
import com.lrm.sprng.tiendamusica.models.dao.ITemaDAO;
import com.lrm.sprng.tiendamusica.models.entities.Estilo;
import com.lrm.sprng.tiendamusica.models.entities.Interpretacion;
import com.lrm.sprng.tiendamusica.models.entities.Interprete;
import com.lrm.sprng.tiendamusica.models.entities.Tema;

@Service
public class InterpretacionServiceImpl implements IInterpretacionService{

	@Autowired
	private IInterpretacionDAO interpretacionDAO;
	
	
	@Autowired
	private ITemaDAO temaDAO;
	
	@Autowired
	private IEstiloDAO estiloDAO;
	
	@Autowired
	private IInterpreteDAO interpreteDAO;

	@Override
	public void save(Interpretacion interpretacion) {
		interpretacionDAO.save(interpretacion);
		
	}

	@Override
	public List<Interpretacion> findAll() {
		
		return (List<Interpretacion>) interpretacionDAO.findAll();
	}

	@Override
	public Interpretacion findOne(Long id) {
		
		return interpretacionDAO.findById(id).orElse(null);
	}

	@Override
	public List<Tema> findByNombreTema(String term) {
		
		return temaDAO.findByNombreTemaLikeIgnoreCase(term);
	}

	@Override
	public List<Estilo> findByNombreEstilo(String term) {
		// TODO Auto-generated method stub
		return estiloDAO.findAllByNombreEstilo(term);
	}

	@Override
	public List<Interprete> findByNombreInterprete(String term) {
		
		return interpreteDAO.findAllByNombreInterpretacion(term);
	}
	
	

}
