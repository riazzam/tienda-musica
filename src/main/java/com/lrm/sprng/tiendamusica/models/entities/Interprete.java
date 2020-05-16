package com.lrm.sprng.tiendamusica.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="interpretes")
public class Interprete {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_interprete")
	private Long idInterprete;
	
	@Column (name="nombre_interprete")
	private String nombreInterprete;
	
	@ManyToMany(mappedBy="listaInterpretes",fetch=FetchType.EAGER)
	
	private List<Interpretacion> listaInterpretaciones;

	public Interprete() {
		listaInterpretaciones=new ArrayList<>();
	}

	public Long getIdInterprete() {
		return idInterprete;
	}

	public void setIdInterprete(Long idInterprete) {
		this.idInterprete = idInterprete;
	}

	public String getNombreInterprete() {
		return nombreInterprete;
	}

	public void setNombreInterprete(String nombreInterprete) {
		this.nombreInterprete = nombreInterprete;
	}

	@Override
	public String toString() {
		return "Interprete [idInterprete=" + idInterprete + ", nombreInterprete=" + nombreInterprete + "]";
	}

}
