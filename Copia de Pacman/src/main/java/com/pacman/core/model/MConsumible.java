package com.pacman.core.model;

import com.pacman.core.entity.Consumible;

public class MConsumible {
	private String idconsumible ;
	private String nombre ;
	private String descripcion ;
	private int precio ;
	
	//constructor
	
	public MConsumible(String id_consumible, String nombre, String descripcion, int precio) {
		this.idconsumible = id_consumible;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public MConsumible(Consumible consumible) {
		this.idconsumible = consumible.getId_consumible();
		this.nombre = consumible.getNombre();
		this.descripcion = consumible.getDescripcion();
		this.precio = consumible.getPrecio();
	}

	public MConsumible() {
		
	}

	//getter and setter

	public String getId_consumible() {
		return idconsumible;
	}

	public void setId_consumible(String id_consumible) {
		this.idconsumible = id_consumible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
