package com.lrm.sprng.tiendamusica.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="estilos")
public class Estilo implements Comparable<Estilo> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_estilo")
	private Long idEstilo;
	
	@Column (name="nombre_estilo")
	private String nombreEstilo;
	
	@OneToMany( fetch=FetchType.LAZY)
	@JoinColumn(name="id_estilo")
	private List<Interpretacion> listaInterpretaciones;

	public Estilo() {
		listaInterpretaciones=new ArrayList<>();
	}

	public Long getIdEstilo() {
		return idEstilo;
	}

	public void setIdEstilo(Long idEstilo) {
		this.idEstilo = idEstilo;
	}

	public String getNombreEstilo() {
		return nombreEstilo;
	}

	public void setNombreEstilo(String nombreEstilo) {
		this.nombreEstilo = nombreEstilo;
	}

	@Override
	public String toString() {
		return " " + nombreEstilo;
	}

	@Override
	public int compareTo(Estilo e) {

		return this.getNombreEstilo().compareTo(e.getNombreEstilo());
	}

}
