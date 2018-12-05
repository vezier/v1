package com.pacman.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="trabajador")
@Entity
public class Trabajador implements Serializable{
	//@GeneratedValue
	@Id
	@Column(name="rut")
	private String rut ;
	@Column(name="nombre")
	private String nombre ;
	
	//constructors
	
	public Trabajador() {
		
	}

	public Trabajador(String rut, String nombre) {
		this.rut = rut;
		this.nombre = nombre;
	}

	//getter and setter

	public String getRut() {
		return rut;
	}



	public void setRut(String rut) {
		this.rut = rut;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
