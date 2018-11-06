package com.pacman.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="cuenta")
@Entity
public class Cuenta {
	@GeneratedValue
	@Id
	@Column(name="id_cuenta")
	private String id_cuenta ;
	@Column(name="estado_cuenta")
	private int estado_cuenta ;
	@ManyToOne
	@JoinColumn(name="id_mesa")
	private Mesa mesa ;
	
	// Constructors
	
	public Cuenta() {

	}

	public Cuenta(String id_cuenta, int estado_cuenta, Mesa mesa) {
		super();
		this.id_cuenta = id_cuenta;
		this.estado_cuenta = estado_cuenta;
		this.mesa = mesa;
	}
	
	// Getter and Setter

	public String getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(String id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public int getEstado_cuenta() {
		return estado_cuenta;
	}

	public void setEstado_cuenta(int estado_cuenta) {
		this.estado_cuenta = estado_cuenta;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}	
	
}
