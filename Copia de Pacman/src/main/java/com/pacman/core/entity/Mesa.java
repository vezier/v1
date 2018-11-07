package com.pacman.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="mesa")
@Entity
public class Mesa implements Serializable{
	//@GeneratedValue
	@Id
	@Column(name="id_mesa")
	private String id_mesa ;
	@Column(name="numero")
	private int numero ;
	@Column(name="estado")
	private int estado ; // 0 or 1 if depends on	
	
	// Constructors
	
	public Mesa() {
		
	}

	public Mesa(String id_mesa, int numero, int estado) {
		this.id_mesa = id_mesa;
		this.numero = numero;
		this.estado = estado;
	}
	
	// Getter and Setter
	public String getId_mesa() {
		return id_mesa;
	}
	public void setId_mesa(String id_mesa) {
		this.id_mesa = id_mesa;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}	
}
