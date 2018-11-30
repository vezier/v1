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
	private String idmesa ;
	@Column(name="numero")
	private int numero ;
	@Column(name="estado")
	private int estado ; // 0 or 1 if depends on	
	
	// Constructors
	
	public Mesa() {
		
	}

	public Mesa(String idmesa, int numero, int estado) {
		this.idmesa = idmesa;
		this.numero = numero;
		this.estado = estado;
	}
	
	// Getter and Setter
	public String getIdmesa() {
		return idmesa;
	}
	public void setIdmesa(String idmesa) {
		this.idmesa = idmesa;
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
