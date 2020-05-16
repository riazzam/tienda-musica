package com.lrm.sprng.tiendamusica.models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="interpretaciones")
public class Interpretacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_interpretacion")
	private Long idInterpretacion;
	
	@Column (name="fecha_interpretacion")
	private Date fechaInterpretacion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tema")
	private Tema temaInterpretacion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_estilo")
	private Estilo estiloInterpretacion;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinTable (name="interpretacion_interpretes", 
				joinColumns= {
						@JoinColumn(name="id_interpretacion",
								referencedColumnName="id_interpretacion",
								nullable=false,
								updatable=false)},
				inverseJoinColumns= {
						@JoinColumn(name="id_interprete",
								referencedColumnName="id_interprete",
								nullable=false,
								updatable=false)}
				
				)
	private List<Interprete> listaInterpretes;
	
	public Interpretacion() {
		listaInterpretes= new ArrayList<>();
		
	}
	
	

	public Long getIdInterpretacion() {
		return idInterpretacion;
	}

	public void setIdInterpretacion(long idInterpretacion) {
		this.idInterpretacion = idInterpretacion;
	}

	public Date getFechaInterpretacion() {
		return fechaInterpretacion;
	}

	public void setFechaInterpretacion(Date fechaInterpretacion) {
		this.fechaInterpretacion = fechaInterpretacion;
	}

	public Tema getTemaInterpretacion() {
		return temaInterpretacion;
	}

	public void setTemaInterpretacion(Tema temaInterpretacion) {
		this.temaInterpretacion = temaInterpretacion;
	}

	public Estilo getEstiloInterpretacion() {
		return estiloInterpretacion;
	}

	public void setEstiloInterpretacion(Estilo estiloInterpretacion) {
		this.estiloInterpretacion = estiloInterpretacion;
	}

	public List<Interprete> getListaInterpretes() {
		return listaInterpretes;
	}

	public void setListaInterpretes(List<Interprete> listaInterpretes) {
		this.listaInterpretes = listaInterpretes;
	}
	
	

	@Override
	public String toString() {
		return "Interpretacion =" + idInterpretacion + "\n\tFechaInterpretacion=" + fechaInterpretacion.getTime()
				+ "\n\tTemaInterpretacion=" + temaInterpretacion + "\n\tEstiloInterpretacion=" + estiloInterpretacion
				+ "\n\tListaInterpretes=" + listaInterpretes + "]";
	}
	
	
}
