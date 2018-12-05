package com.pacman.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="consumible")
@Entity
public class Consumible implements Serializable{
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Id
	@Column(name="id_consumible")
	private int idconsumible ;
	@Column(name="nombre")
	private String nombre ;
	@Column(name="precio")
	private int precio ;
	
	//Constructor
	public Consumible(int idconsumible, String nombre, int precio) {
		this.idconsumible = idconsumible;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Consumible() {
		
	}

	// Getter and Setter
	public int getIdconsumible() {
		return idconsumible;
	}
	
	public void setIdconsumible(int idconsumible) {
		this.idconsumible = idconsumible;
	}
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
