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
@Table (name="temas")
public class Tema implements Comparable<Tema>{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_tema")
	private long idTema;
	
	@Column (name="nombre_tema")
	private String nombreTema;
	
	@Column (name="autor_tema")
	private String autor;
	
	
	@OneToMany( fetch=FetchType.LAZY)
	@JoinColumn(name="id_tema")
	private List<Interpretacion> listaInterpretaciones;
	
	public Tema() {
		listaInterpretaciones=new ArrayList<>();
	}

	public Tema(long idTema, String nombreTema, String autor) {
		super();
		this.idTema = idTema;
		this.nombreTema = nombreTema;
		this.autor = autor;
	}

	public long getIdTema() {
		return idTema;
	}

	public void setIdTema(long idTema) {
		this.idTema = idTema;
	}

	public String getNombreTema() {
		return nombreTema;
	}

	public void setNombreTema(String nombreTema) {
		this.nombreTema = nombreTema;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Tema [idTema=" + idTema + ", nombreTema=" + nombreTema + ", autor=" + autor + "]";
	}

	@Override
	public int compareTo(Tema tema) {
		
		
		return this.getNombreTema().compareTo(tema.getNombreTema());
	}
	
	
}
