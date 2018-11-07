package com.pacman.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="cuenta")
@Entity
public class Cuenta implements Serializable{
	//@GeneratedValue
	@Id
	@Column(name="id_cuenta")
	private String id ;
	@Column(name="estado_cuenta")
	private int estado_cuenta ;
	//@ManyToOne
	@JoinColumn(name="id_mesa")
	private String idmesa ;
	
	// Constructors
	
	public Cuenta() {

	}

	public Cuenta(String id_cuenta, int estado_cuenta, String idmesa) {
		
		this.id = id_cuenta;
		this.estado_cuenta = estado_cuenta;
		this.idmesa = idmesa;
	}
	
	// Getter and Setter

	public String getId_cuenta() {
		return id;
	}

	public void setId_cuenta(String id_cuenta) {
		this.id = id_cuenta;
	}

	public int getEstado_cuenta() {
		return estado_cuenta;
	}

	public void setEstado_cuenta(int estado_cuenta) {
		this.estado_cuenta = estado_cuenta;
	}

	public String getidMesa() {
		return idmesa;
	}

	public void setidmesa(String idmesa) {
		this.idmesa = idmesa;
	}	
	
}
