package com.pacman.core.model;

import com.pacman.core.entity.Consumible;

public class MConsumible {
	private String nombre ;
	private int precio ;
	
	//constructor
	
	public MConsumible(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public MConsumible(Consumible consumible) {
		this.nombre = consumible.getNombre();
		this.precio = consumible.getPrecio();
	}

	public MConsumible() {
		
	}

	//getter and setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
