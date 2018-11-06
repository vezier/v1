package com.pacman.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="trabajador")
@Entity
public class Trabajador {
	@GeneratedValue
	@Id
	@Column(name="rut")
	private String rut ;
	@Column(name="nombre")
	private String nombre ;
	@Column(name="telefono")
	private int telefono ;
	
	//constructors
	
	public Trabajador() {
		
	}

	public Trabajador(String rut, String nombre, int telefono) {
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
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



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
