package com.pacman.core.model;

import com.pacman.core.entity.Trabajador;

public class MTrabajador {
	private String rut ;
	private String nombre ;
	
	// constructors
	public MTrabajador(Trabajador trabajador) {
		this.rut = trabajador.getRut();
		this.nombre = trabajador.getNombre();
	}
	
	public MTrabajador() {

	}
	public MTrabajador(String rut, String nombre) {
		this.rut = rut;
		this.nombre = nombre;
	}
	
	// getter and setter
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
