package com.pacman.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="consumible")
@Entity
public class Consumible {
	@GeneratedValue
	@Id
	@Column(name="id_consumible")
	private String id_consumible ;
	@Column(name="nombre")
	private String nombre ;
	@Column(name="descripcion")
	private String descripcion ;
	@Column(name="precio")
	private int precio ;
	
	//Constructor
	public Consumible(String id_consumible, String nombre, String descripcion, int precio) {
		this.id_consumible = id_consumible;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public Consumible() {
		
	}

	// Getter and Setter
	public String getId_consumible() {
		return id_consumible;
	}
	
	public void setId_consumible(String id_consumible) {
		this.id_consumible = id_consumible;
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
